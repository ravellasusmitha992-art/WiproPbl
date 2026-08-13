package com.login;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String username =
                request.getParameter("username");

        String password =
                request.getParameter("password");

        String sql =
            "SELECT * FROM USERS WHERE USERNAME = ? AND PASSWORD = ?";

        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                response.sendRedirect("home.jsp");

            } else {

                request.setAttribute(
                        "error",
                        "Invalid username or password");

                RequestDispatcher rd =
                        request.getRequestDispatcher("login.jsp");

                rd.forward(request, response);
            }

        } catch (SQLException e) {

            e.printStackTrace();

            response.setContentType("text/html");

            response.getWriter().println(
                "<h3>Database connection error</h3>");
        }
    }
}