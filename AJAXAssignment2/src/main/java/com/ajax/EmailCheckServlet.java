package com.ajax;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/checkEmail")
public class EmailCheckServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/plain");

        PrintWriter out = response.getWriter();

        String email = request.getParameter("email");

        if (email == null || email.trim().isEmpty()) {
            out.print("Invalid Email Id");
            return;
        }

        email = email.trim();

        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {

            con = DBConnection.getConnection();

            String sql =
                "SELECT EMAIL FROM PROFILE " +
                "WHERE LOWER(EMAIL) = LOWER(?)";

            ps = con.prepareStatement(sql);

            ps.setString(1, email);

            rs = ps.executeQuery();

            if (rs.next()) {
                out.print("Not Available!");
            } else {
                out.print("Available!");
            }

        } catch (Exception e) {

            e.printStackTrace();

            out.print("Database Error");

        } finally {

            try {
                if (rs != null)
                    rs.close();

                if (ps != null)
                    ps.close();

                if (con != null)
                    con.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}