package com.example.projet_web.action;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ActionDebut implements Action {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        return "/Login.jsp";
    }
}