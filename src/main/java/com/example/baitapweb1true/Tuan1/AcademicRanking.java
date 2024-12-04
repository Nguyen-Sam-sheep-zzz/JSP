package com.example.baitapweb1true.Tuan1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "academicRanking", value = "/ranking")
public class AcademicRanking extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        double input = Double.parseDouble(req.getParameter("ranking"));
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        if (input > 10) {
            writer.println("<h1> ERROR : input < 10 </h1>");
            return;
        } else if (input >= 8.5) {
            writer.println("<h1> A student</h1>");
            return;
        } else if (input >= 7 && input < 8.5) {
            writer.println("<h1> B student</h1>");
            return;
        } else if (input >= 5.5 && input < 7) {
            writer.println("<h1> C student</h1>");
            return;
        } else if (input > 4 && input < 5.5) {
            writer.println("<h1> D student</h1>");
            return;
        } else {
            writer.println("<h1> F student </h1>");
        }
        writer.println("</html>");
    }
}
