package com.login;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String username =
                request.getParameter("username");

        String password =
                request.getParameter("password");

        String confirmPassword =
                request.getParameter("confirmPassword");

        if (!password.equals(confirmPassword)) {

            response.setContentType("text/html");

            response.getWriter().println(
                "<h3>Passwords do not match.</h3>");

            response.getWriter().println(
                "<a href='register.jsp'>Go Back</a>");

            return;
        }

        String sql =
            "INSERT INTO USERS (USERNAME, PASSWORD) VALUES (?, ?)";

        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, username);
            ps.setString(2, password);

            ps.executeUpdate();

            response.sendRedirect("index.html");

        } catch (SQLException e) {

            e.printStackTrace();

            response.setContentType("text/html");

            response.getWriter().println(
                "<h3>Registration failed. Username may already exist.</h3>");

            response.getWriter().println(
                "<a href='register.jsp'>Try Again</a>");
        }
    }
}