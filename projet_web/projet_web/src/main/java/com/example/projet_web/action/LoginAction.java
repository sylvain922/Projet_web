package com.example.projet_web.action;

import com.example.projet_web.beans.UserBean;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoginAction implements Action {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {

        String login = request.getParameter("login");
        String password = request.getParameter("password");

        if ("Charly".equals(login) && "1234".equals(password)) {
            UserBean user = new UserBean(login);

            HttpSession session = request.getSession();
            session.setAttribute("user", user);

            return "/Page1.jsp";
        } else {
            return "/erreur.jsp";
        }
    }
}