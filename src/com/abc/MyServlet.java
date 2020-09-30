package com.abc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;

public class MyServlet implements Servlet{

	ServletConfig config;
	
	// life cycle methods
	public void init(ServletConfig config) {
		this.config = config;
		System.out.println("Initializing......");
	}
	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("Servicing.....");
		response.setContentType("text/html");
		PrintWriter out =   response.getWriter();
		out.print("<h1>Hello from servlet service method</h1>");
	}
	
	public void destroy() {
		System.out.println("destroy.....");
	}
	
	// non life cycle method
	
	public ServletConfig getServletConfig() {
		return this.config;
	}
	
	public String getServletInfo() {
		return "Servlet name is : my firsy servley";
	}
	
	
	
	
	
	
	
}
