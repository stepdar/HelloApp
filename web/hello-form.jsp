<%--
  Created by IntelliJ IDEA.
  User: wilder
  Date: 21/04/18
  Time: 17:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello-form</title>
</head>
<body>
    <form action="/simple-hello" method="post">
        <fieldset>
            <legend>Personnal information :</legend>
            <label for="firstname">First name :</label><br>
            <input type="text" name="firstName" id="firstname" placeholder="first name"><br>
            <label for="name">Name : </label><br>
            <input type="text" name="name" id="name" placeholder="name..."><br>
            <label for="time">Hour :</label><br>
            <input type="time" id="time" name="time" ><br>
            <input type="submit" value="Submit">
        </fieldset>
    </form>
</body>
</html>
