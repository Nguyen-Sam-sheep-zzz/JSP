package com.example.baitapweb1true.Tuan1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "discountCalculator", value = "/calculator")
public class DiscountCalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        try {
            float price = Float.parseFloat(request.getParameter("List Price"));
            float discountPercentInput = Float.parseFloat(request.getParameter("Discount Percent"));
            if (discountPercentInput > 100) {
                writer.println("<h1>Discount Percentage Error</h1>");
                return;
            }
            double discountAmount = price / 100 * discountPercentInput; ;
            double discountPrice = price - discountAmount;

            writer.println("<h1>Discount amount: " + discountAmount + "</h1>");
            writer.println("<h1>Discount price: " + discountPrice + "</h1>");
        } catch (NumberFormatException e) {
            writer.println("<h1>Khonng duoc nhap chu vao truong chiet khau va gia niem yet</h1>");
        }
        writer.println("</html>");
    }
}
