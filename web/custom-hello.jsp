<%--
  Created by IntelliJ IDEA.
  User: wilder
  Date: 21/04/18
  Time: 21:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <link rel="stylesheet" type="text/css" href="style.css"/>
    <link href="https://fonts.googleapis.com/css?family=Gamja+Flower" rel="stylesheet">
    <title>Hello</title>
</head>
<body>
    <div>
        <p>${parameters.get(2)}</p>
        <p>${parameters.get(0)}  <span>${parameters.get(1)}</span></p>
    </div>
</body>
</html>
