<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 8/11/2023
  Time: 10:22 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <h2>Currency Converter</h2>
    <form action="/converter"  method="post">
        <label>Rate: </label><br/>
        <input type="text" name="rate" placeholder="RATE" ><br/>
        <label>USD: </label><br/>
        <input type="text" name="usd" placeholder="USD" ><br/>
        <input type = "submit" id = "submit" value = "Converter"/>
    </form>
</center>
</body>
</html>
