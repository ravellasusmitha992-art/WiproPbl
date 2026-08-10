package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(
    urlPatterns = "/config",
    initParams = {
        @jakarta.servlet.annotation.WebInitParam(
            name = "servletName",
            value = "Config Context Demo Servlet"
        ),
        @jakarta.servlet.annotation.WebInitParam(
            name = "college",
            value = "VVIT"
        )
    }
)
public class ConfigContextServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        ServletConfig config = getServletConfig();
        ServletContext context = getServletContext();
        String collegeName = context.getInitParameter("collegeName");
        String location = context.getInitParameter("location");

        String servletName =
                config.getInitParameter("servletName");

        String college =
                config.getInitParameter("college");

        out.println("<h1>Servlet Config and Context Parameters</h1>");

        out.println("<h2>Servlet Config</h2>");
        out.println("Servlet Name: " + servletName + "<br>");
        out.println("College: " + college + "<br>");

        out.println("<h2>Servlet Context Parameters</h2>");
        out.println("College Name: " + collegeName + "<br>");
        out.println("Location: " + location + "<br>");
    }
}