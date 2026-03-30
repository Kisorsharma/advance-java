<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
    <style>
        body { font-family: Arial; display: flex; justify-content: center; margin-top: 100px; }
        form { display: flex; flex-direction: column; gap: 10px; width: 250px; }
        input { padding: 8px; font-size: 14px; }
        button { padding: 8px; background: #4CAF50; color: white; border: none; cursor: pointer; }
        .error { color: red; }
        .success { color: green; }
    </style>
</head>
<body>
    <div>
        <h2>Login</h2>
        <% String msg = request.getParameter("msg"); %>
        <% if ("fail".equals(msg)) { %><p class="error">Invalid credentials.</p><% } %>
        <% if ("out".equals(msg)) { %><p class="success">Logged out successfully.</p><% } %>
        <% if ("auth".equals(msg)) { %><p class="error">Please login first.</p><% } %>

        <form action="process.jsp" method="post">
            <input type="text"     name="username" placeholder="Username" required />
            <input type="password" name="password" placeholder="Password" required />
            <button type="submit">Login</button>
        </form>
    </div>
</body>
</html>
