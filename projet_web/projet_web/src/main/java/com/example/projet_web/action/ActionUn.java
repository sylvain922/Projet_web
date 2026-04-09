package com.example.projet_web.action;

import com.example.projet_web.beans.UserBean;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class ActionUn implements Action {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession(false);

        if (session == null || session.getAttribute("user") == null) {
            return "/index.jsp";
        }

        UserBean user = (UserBean) session.getAttribute("user");

        String attribut2 = request.getParameter("attribut2");
        String attribut3 = request.getParameter("attribut3");

        user.setAttribut2(attribut2);
        user.setAttribut3(attribut3);

        session.setAttribute("user", user);

        return "/Page1.jsp";
    }
}