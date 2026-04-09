<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
</head>
<body>
<h2>Login.jsp</h2>

<form action="loginAction.perform" method="post">
    <label for="login">Login :</label>
    <input type="text" id="login" name="login" required>
    <br><br>

    <label for="password">Password :</label>
    <input type="password" id="password" name="password" required>
    <br><br>

    <button type="submit">OK</button>
</form>

<p>Test : login = Charly / password = azerty</p>
</body>
</html>