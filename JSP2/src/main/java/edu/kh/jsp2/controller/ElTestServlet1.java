package edu.kh.jsp2.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/el/test1")
public class ElTestServlet1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        try {
            // Request processing can go here (if needed)
            
            // Forward the request to the JSP
            RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/el/test1.jsp");
            dispatcher.forward(req, resp);
        } catch (Exception e) {
            e.printStackTrace(); // In case of an error, log it
        }
    }
}
