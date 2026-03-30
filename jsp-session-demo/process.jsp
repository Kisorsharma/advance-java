<%@ page contentType="text/html; charset=UTF-8"%>
<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");

    if ("admin".equals(username) && "admin123".equals(password)) {
        session.setAttribute("username", username);
        response.sendRedirect("home.jsp");
    } else {
        response.sendRedirect("login.jsp?msg=fail");
    }
%>
