package com.rchab.web.app1;

import com.sun.net.httpserver.HttpsParameters;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MyServletClass extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        String studentId = request.getParameter("id");
//        Student student = studentService.getById(studentId);
        out.println("<html>");
        out.println("<body>");
        out.println("<h1>Student with id =" + studentId + " </h1>");
        out.println("</body>");
        out.println("</html>");
    }
}
