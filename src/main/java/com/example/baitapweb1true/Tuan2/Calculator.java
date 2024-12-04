package com.example.baitapweb1true.Tuan2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Calculator", value = "/calculatorT2")
public class Calculator extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        double inputA = Double.parseDouble(req.getParameter("inputA"));
        double inputB = Double.parseDouble(req.getParameter("inputB"));
        double result = 0;
        String calculator = req.getParameter("calculator");
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        switch (calculator) {
            case "+":
                result = inputA + inputB;
                break;
            case "-":
                result = inputA - inputB;
                break;
            case "x":
                result = inputA * inputB;
                break;
            case "/":
                if (inputB != 0) {
                    result = inputA / inputB;
                } else {
                    writer.println("<h3>ERROR cannot be divided by zero</h3>");
                }
                break;
            default:
                writer.println("<h3>ERROR</h3>");
        }
        writer.println("<h3>Result: " + inputA + " " + calculator + " " + inputB + " = " + result + "</h3>");
        writer.println("</html>");
    }
}
