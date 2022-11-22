<%--
  Created by IntelliJ IDEA.
  User: Andrew
  Date: 22.11.2022
  Time: 10:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>FirstJSP</title>
</head>
<body>
    <h1>Testing JSP</h1>

    <p>
        <%
            for (int i = 0; i < 10; i++) {
                out.println("Hello: " + i);
            }
        %>
    </p>


</body>
</html>
