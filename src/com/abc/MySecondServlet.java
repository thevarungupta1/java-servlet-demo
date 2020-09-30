package com.abc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;


public class MySecondServlet extends GenericServlet  {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Service is called from generic servlet");
		res.setContentType("text/html");
		PrintWriter out =  res.getWriter();
		out.println("<h1>Hello from service of generic servlet</h1>");
			
	}

}
