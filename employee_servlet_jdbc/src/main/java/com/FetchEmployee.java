package com;

import java.io.IOException;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/fetch")
public class FetchEmployee extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
            		"jdbc:mysql://localhost:3306/employee_servlet_jdbc?createDatabaseIfNotExist=true", "root", "root");

            // Create Statement
            Statement st = con.createStatement();

            // Query (fixed id = 1)
            ResultSet rs = st.executeQuery(
                    "SELECT * FROM employee WHERE id=1");

            if (rs.next()) {

                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String password = rs.getString("password");
                double salary = rs.getDouble("salary");

                // Store data
                req.setAttribute("id", id);
                req.setAttribute("name", name);
                req.setAttribute("email", email);
                req.setAttribute("password", password);
                req.setAttribute("salary", salary);

                // Console
                System.out.println("From First Servlet:");
                System.out.println(id + " " + name + " " + email + " " + password + " " + salary);

                // Forward
                RequestDispatcher rd = req.getRequestDispatcher("display");
                rd.forward(req, res);

            } else {
                System.out.println("No data found!");
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}