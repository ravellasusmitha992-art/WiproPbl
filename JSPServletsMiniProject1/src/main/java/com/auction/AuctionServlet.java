package com.auction;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/auction")
public class AuctionServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        int itemId = Integer.parseInt(
                request.getParameter("itemId"));

        String itemName =
                request.getParameter("itemName");

        String userName =
                request.getParameter("userName");

        String email =
                request.getParameter("email");

        double amount = Double.parseDouble(
                request.getParameter("amount"));

        String auto =
                request.getParameter("autoIncrement");

        boolean autoIncrement = auto != null;

        AuctionBean auction = new AuctionBean();

        auction.setItemId(itemId);
        auction.setItemName(itemName);
        auction.setUserName(userName);
        auction.setEmail(email);
        auction.setAmount(amount);
        auction.setAutoIncrement(autoIncrement);

        request.setAttribute("auction", auction);

        RequestDispatcher rd =
                request.getRequestDispatcher("bid.jsp");

        rd.forward(request, response);
    }
}