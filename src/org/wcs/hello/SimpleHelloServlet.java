package org.wcs.hello;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.*;

@WebServlet(name = "SimpleHelloServlet", urlPatterns = {"/simple-hello"})
public class SimpleHelloServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //recovery of parameters in  the request
        String paramFirstName = request.getParameter("firstName");
        String paramName = request.getParameter("name");
        String paramHour = request.getParameter("time");
        String message;

        //format of string hh:mm to hh and convert string into int
        String paramHourFinal = paramHour.substring(0,2);
        int hour = Integer.parseInt(paramHourFinal);

        //condition and create message
        if(hour > 0 && hour < 12){
            message="Good morning";

        }else if(hour >= 12 && hour <= 20){
            message = "Good afternoon";
        }else{
            message="Good night";
        }

        //creation of list of the parameters
        List<String> params = new ArrayList();
            params.add(paramFirstName);
            params.add(paramName);
            params.add(message);

         // creation of attributs contenair
        request.setAttribute("parameters", params);

        //send to new page
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/custom-hello.jsp");
        requestDispatcher.forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.print("Simple Hello");
    }
}
