<%@ page import="logic.Cart" %><%--
  Created by IntelliJ IDEA.
  User: Andrew
  Date: 22.11.2022
  Time: 10:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show cart</title>
</head>
<body>
    <%@page import="logic.Cart" %>
    <%
        Cart cart = (Cart) session.getAttribute("cart");
    %>
    <p>Name: <%= cart.getName()%> </p>
    <p>Amount: <%= cart.getAmount()%> </p>

</body>
</html>
