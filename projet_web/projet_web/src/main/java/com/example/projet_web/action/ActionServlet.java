package com.example.projet_web.action;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ActionServlet extends HttpServlet {

    private MaFactory factory;

    @Override
    public void init() throws ServletException {
        factory = new MaFactory();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        traiter(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        traiter(request, response);
    }

    private void traiter(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String path = request.getServletPath();

        Action action = factory.getAction(path);

        if (action == null) {
            response.sendError(HttpServletResponse.SC_NOT_FOUND, "Action inconnue");
            return;
        }

        String vue = action.execute(request, response);
        request.getRequestDispatcher(vue).forward(request, response);
    }
}