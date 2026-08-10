package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/visit")
public class FirstVisitServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        boolean firstVisit = true;

        Cookie[] cookies = request.getCookies();

        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if ("visited".equals(cookie.getName())) {
                    firstVisit = false;
                    break;
                }
            }
        }

        out.println("<html><body>");

        if (firstVisit) {
            out.println("<h1>Welcome, you are visiting for the first time</h1>");

            Cookie cookie = new Cookie("visited", "true");
            cookie.setMaxAge(60 * 60 * 24 * 30);
            response.addCookie(cookie);

        } else {
            out.println("<h1>Welcome Back</h1>");
        }

        out.println("</body></html>");
    }
}