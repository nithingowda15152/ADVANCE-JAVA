package com.first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/pageD")
public class PageD extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        System.out.println("This is Page D");

        // get data (downcasting)
        int id = (Integer) req.getAttribute("id");
        String name = (String) req.getAttribute("name");
        String email = (String) req.getAttribute("email");
        String password = (String) req.getAttribute("password");
        String phone = (String) req.getAttribute("phone");

        // display in browser
        resp.setContentType("text/html");
        PrintWriter pw = resp.getWriter();

        pw.println("<h2>User Details</h2>");
        pw.println("ID: " + id + "<br>");
        pw.println("Name: " + name + "<br>");
        pw.println("Email: " + email + "<br>");
        pw.println("Password: " + password + "<br>");
        pw.println("Phone: " + phone + "<br>");
    }
}