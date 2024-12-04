package com.example.baitapweb1true.Tuan1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "checkPrimeNumber", value = "/checkPrime")
public class CheckPrimeNumber extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        try {
            double num = Double.parseDouble(req.getParameter("num"));
            if (num < 2) {
                writer.println("<h1>Khong phai la so nguyen to</h1>");
                return;
            }
            double squareRoot = Math.sqrt(num);
            for (int i = 2; i <= squareRoot; i++) {
                if (num % i == 0) {
                    writer.println("<h1>Khong phai la so nguyen to</h1>");
                    return;
                }
            }
            writer.println("<h1>La so nguyen to</h1>");
        } catch (NumberFormatException e) {
            writer.println("<h1>Vui long nhap ki tu la so</h1>");
        }
        writer.println("</html>");
    }
}