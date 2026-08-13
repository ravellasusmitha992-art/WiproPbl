package com.login;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/changePassword")
public class ChangePasswordServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String username =
                request.getParameter("username");

        String oldPassword =
                request.getParameter("oldPassword");

        String newPassword =
                request.getParameter("newPassword");

        String confirmPassword =
                request.getParameter("confirmPassword");

        response.setContentType("text/html");

        // Check new password and retyped password
        if (!newPassword.equals(confirmPassword)) {

            response.getWriter().println(
                "<h3>New passwords do not match.</h3>");

            response.getWriter().println(
                "<a href='changePassword.jsp'>Go Back</a>");

            return;
        }

        String checkSql =
            "SELECT * FROM USERS WHERE USERNAME = ? AND PASSWORD = ?";

        String updateSql =
            "UPDATE USERS SET PASSWORD = ? WHERE USERNAME = ?";

        try (Connection con = DBUtil.getConnection();
             PreparedStatement check =
                     con.prepareStatement(checkSql)) {

            check.setString(1, username);
            check.setString(2, oldPassword);

            ResultSet rs = check.executeQuery();

            if (!rs.next()) {

                response.getWriter().println(
                    "<h3>Invalid username or old password.</h3>");

                response.getWriter().println(
                    "<a href='changePassword.jsp'>Go Back</a>");

                return;
            }

            try (PreparedStatement update =
                    con.prepareStatement(updateSql)) {

                update.setString(1, newPassword);
                update.setString(2, username);

                update.executeUpdate();
            }

            response.getWriter().println(
                "<h2>Password changed successfully.</h2>");

            response.getWriter().println(
                "<a href='index.html'>Go to Login</a>");

        } catch (SQLException e) {

            e.printStackTrace();

            response.getWriter().println(
                "<h3>Database error occurred.</h3>");
        }
    }
}