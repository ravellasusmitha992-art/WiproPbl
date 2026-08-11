package com.assignment2;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/OperationServlet")
public class OperationServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        String operationValue = request.getParameter("operation");

        int operation;

        try {
            operation = Integer.parseInt(operationValue);
        } catch (Exception e) {
            RequestDispatcher rd =
                    request.getRequestDispatcher("error.jsp");
            rd.forward(request, response);
            return;
        }

        RequestDispatcher rd;

        if (operation < 10) {
            rd = request.getRequestDispatcher("page1.jsp");

        } else if (operation > 10 && operation < 99) {
            rd = request.getRequestDispatcher("page2.jsp");

        } else {
            rd = request.getRequestDispatcher("error.jsp");
        }

        rd.forward(request, response);
    }
}