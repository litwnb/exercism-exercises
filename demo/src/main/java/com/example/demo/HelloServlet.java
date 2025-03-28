package com.example.demo;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");

        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");

        String name = req.getParameter("username");
        String age = req.getParameter("userage");
        String gender = req.getParameter("gender");
        String country = req.getParameter("country");
        String[] courses = req.getParameterValues("courses");

        try (PrintWriter writer = resp.getWriter()) {
            writer.print("<p>Name: " + name + "</p>");
            writer.print("<p>Age: " + age + "</p>");
            writer.print("<p>Gender: " + gender + "</p>");
            writer.print("<p>Country: " + country + "</p>");
            writer.print("<h4>Courses</h4>");
            for (String course : courses) {
                writer.println("<li>" + course + "</li>");
            }
        }
    }
}