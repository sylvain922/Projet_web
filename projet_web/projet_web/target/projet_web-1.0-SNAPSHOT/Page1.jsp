<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="com.example.projet_web.beans.UserBean" %>

<%
    UserBean user = (UserBean) session.getAttribute("user");
    if (user == null) {
        response.sendRedirect("index.jsp");
        return;
    }
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Page1</title>
</head>
<body>
<p>Welcome <strong><%= user.getLogin() %></strong></p>

<form action="actionUn.perform" method="post">
    <label for="attribut2">Attribut 2 :</label>
    <input type="text" id="attribut2" name="attribut2"
           value="<%= user.getAttribut2() == null ? "" : user.getAttribut2() %>">
    <br><br>

    <label for="attribut3">Attribut 3 :</label>
    <input type="text" id="attribut3" name="attribut3"
           value="<%= user.getAttribut3() == null ? "" : user.getAttribut3() %>">
    <br><br>

    <button type="submit">OK</button>
</form>

<a href="logoutAction.perform">Logout</a>
</body>
</html>