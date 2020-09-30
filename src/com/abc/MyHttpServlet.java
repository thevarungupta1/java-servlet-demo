package com.abc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

public class MyHttpServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		System.out.println("do get ...");
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("do get request");
		
	}
	
	

}
