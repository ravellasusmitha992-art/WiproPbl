<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
</head>

<body>

    <h2>Login</h2>

    <% 
        String error = (String) request.getAttribute("error");
        if (error != null) {
    %>
        <p style="color:red;"><%= error %></p>
    <% 
        }
    %>

    <form action="login" method="post">

        <label>Username:</label>
        <input type="text" name="username" required>

        <br><br>

        <label>Password:</label>
        <input type="password" name="password" required>

        <br><br>

        <input type="submit" value="Login">

    </form>

    <br>

    <a href="register.jsp">New User</a>

    <br><br>

    <a href="changePassword.jsp">Change Password</a>

</body>
</html>