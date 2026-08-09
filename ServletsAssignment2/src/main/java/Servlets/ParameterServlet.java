package Servlets;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ParameterServlet")
public class ParameterServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        showParameters(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request,
                           HttpServletResponse response)
            throws ServletException, IOException {

        showParameters(request, response);
    }

    private void showParameters(HttpServletRequest request,
                                HttpServletResponse response)
            throws IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Request Parameters</title>");
        out.println("</head>");

        out.println("<body>");

        out.println("<h2>Parameters Received</h2>");

        for (Map.Entry<String, String[]> entry :
                request.getParameterMap().entrySet()) {

            out.println("<b>" + entry.getKey() + ":</b> ");

            String[] values = entry.getValue();

            for (String value : values) {
                out.println(value + " ");
            }

            out.println("<br><br>");
        }

        out.println("</body>");
        out.println("</html>");
    }
}