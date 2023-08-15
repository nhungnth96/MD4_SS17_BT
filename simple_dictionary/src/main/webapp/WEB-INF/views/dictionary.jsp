<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 8/15/2023
  Time: 9:11 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <h2>Vietnamese Dictionary</h2>
    <form action="/result">
        <input type="text" name="search" placeholder="Enter your word: "/>
        <input type = "submit" id = "submit" value = "Search"/>
    </form>
    <p>${result}</p>
</center>
</body>
</html>
