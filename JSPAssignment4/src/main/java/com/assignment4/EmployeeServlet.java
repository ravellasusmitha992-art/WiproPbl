package com.assignment4;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        // Get employee object from request
        Employee employee =
                (Employee) request.getAttribute("employee");

        Connection con = null;
        PreparedStatement ps = null;

        try {

            // Get database connection
            con = DBConnection.getConnection();

            // Check database connection
            if (con == null) {
                response.getWriter().println(
                    "Database connection failed!"
                );
                return;
            }

            // SQL query
            String sql =
                    "INSERT INTO EMPLOYEE (NAME, ID, DESIGNATION) "
                    + "VALUES (?, ?, ?)";

            // Create PreparedStatement
            ps = con.prepareStatement(sql);

            // Set employee values
            ps.setString(1, employee.getName());
            ps.setInt(2, employee.getId());
            ps.setString(3, employee.getDesignation());

            // Execute INSERT
            int result = ps.executeUpdate();

            if (result > 0) {

                // Send employee object to success.jsp
                request.setAttribute("employee", employee);

                RequestDispatcher rd =
                        request.getRequestDispatcher("success.jsp");

                rd.forward(request, response);

            } else {

                response.getWriter().println(
                    "Employee registration failed!"
                );
            }

        } catch (Exception e) {

            e.printStackTrace();

            response.getWriter().println(
                "Database Error: " + e.getMessage()
            );

        } finally {

            try {

                if (ps != null) {
                    ps.close();
                }

                if (con != null) {
                    con.close();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}