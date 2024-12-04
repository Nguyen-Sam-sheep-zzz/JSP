package com.example.baitapweb1true.Tuan1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "bmiServlet", value = "/bmi")
public class BmiServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        double heightInput = Double.parseDouble(req.getParameter("inputH"));
        resp.setContentType("text/html; charset=UTF-8");
        double height = heightInput / 100 ;
        System.out.println(height);
        double weight = Double.parseDouble(req.getParameter("inputW"));
        System.out.println(weight);
        double bmi = weight / (height * height);

        System.out.println(bmi);
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        if (bmi >= 40) {
            out.println("<h1> Lợn nái to nhất Vn, đớp ít thoii cho đất nước nó phát triển, béo như con lợn </h1>");
            return;
        } else if (bmi >= 35 && bmi < 39.9) {
            out.println("<h1> Lợn nái to thứ 2 Vn, đớp ít thoii béo lắm r</h1>");
            return;
        } else if (bmi >= 30 && bmi < 34.9) {
            out.println("<h1> Lợn nái Vn,đớp ít thoii béo rồi đấy</h1>");
            return;
        } else if (bmi >= 25 && bmi < 29.9) {
            out.println("<h1> Hốc ít thoii thừa cân rồi </h1>");
            return;
        } else if (bmi >= 18.5 && bmi < 24.9) {
            out.println("<h1> Ok ngon rồi con ơi </h1>");
            return;
        } else {
            out.println("<h1> sờ ke le từn à </h1>");
        }
        out.println("</html>");
    }
}
