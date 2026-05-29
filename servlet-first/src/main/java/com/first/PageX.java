package com.first;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//transfer req from servlet class to html file
//provide webapp files complete file name with extension for arg in servlet class
//execute: start server from project--give grapes url in browser
@WebServlet("/grapes")
public class PageX extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("This is PageX servlet class");
		
		RequestDispatcher rd=req.getRequestDispatcher("page-y.html");
		rd.forward(req, resp);
	}
}
