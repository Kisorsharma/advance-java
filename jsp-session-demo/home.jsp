<%@ page contentType="text/html; charset=UTF-8"%>
<%
    String username = (String) session.getAttribute("username");
    if (username == null) {
        response.sendRedirect("login.jsp?msg=auth");
        return;
    }
%>
<!DOCTYPE html>
<html>
<head>
    <title>Home</title>
    <style>
        body { font-family: Arial; text-align: center; margin-top: 100px; }
        a { color: red; }
    </style>
</head>
<body>
    <h2>Welcome, <%= username %>!</h2>
    <p>Session ID: <%= session.getId() %></p>
    <a href="logout.jsp">Logout</a>
</body>
</html>
