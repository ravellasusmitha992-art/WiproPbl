package com.ajax;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

// మీరు అడిగిన javax ప్యాకేజీలు
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// ఈ లైన్ చాలా ముఖ్యం, ఇది HTML కి సర్వ్‌లెట్‌ని లింక్ చేస్తుంది
@WebServlet("/CityServlet")
public class CityServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        // HTML డ్రాప్‌డౌన్ నుండి వచ్చిన వాల్యూని తీసుకోవడం
        String state = request.getParameter("state");

        // సిటీల డేటా (Static List)
        Map<String, String[]> cityMap = new HashMap<String, String[]>();
        cityMap.put("AndhraPradesh", new String[]{"Visakhapatnam", "Vijayawada", "Guntur"});
        cityMap.put("Telangana", new String[]{"Hyderabad", "Warangal", "Nizamabad"});
        cityMap.put("Karnataka", new String[]{"Bangalore", "Mysore", "Hubli"});

        String[] cities = cityMap.get(state);

        // AJAX రెస్పాన్స్ పంపడం (Table Format)
        if (cities != null) {
            out.print("<table border='1' style='border-collapse:collapse; width:300px; margin-top:15px;'>");
            out.print("<tr style='background-color:#00B0F0; color:white;'><th>S.No</th><th>Important Cities</th></tr>");
            for (int i = 0; i < cities.length; i++) {
                out.print("<tr><td style='text-align:center;'>" + (i + 1) + "</td><td>" + cities[i] + "</td></tr>");
            }
            out.print("</table>");
        } else {
            out.print("<p style='color:red;'>No data available.</p>");
        }
    }
}