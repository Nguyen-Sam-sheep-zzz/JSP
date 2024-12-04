package com.example.baitapweb1true.Tuan1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "triangulationTest", value = "/triangulation")
public class TriangulationTest extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        double inputA = Double.parseDouble(req.getParameter("inputA"));
        double inputB = Double.parseDouble(req.getParameter("inputB"));
        double inputC = Double.parseDouble(req.getParameter("inputC"));
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        if (checkTriangulation(inputA, inputB, inputC)) {
            if (inputA == inputB && inputB == inputC) {
                writer.println("<h1> is Equilateral triangle </h1>");
                return;
            } else if (inputA == inputB || inputA == inputC || inputB == inputC) {
                writer.println("<h1> is Isosceles triangle </h1>");
                return;
            } else {
                writer.println("<h1> is regular triangle </h1>");
            }
        }
        else {
            writer.println("<h1> 3 canh khong tao thanh mot tam giac hop le </h1>");
        }
        writer.println("</html>");
    }
    public boolean checkTriangulation(double inputA, double inputB, double inputC) {
        return (inputA + inputB > inputC && inputA + inputC > inputB && inputB + inputC > inputA);
    }
}
