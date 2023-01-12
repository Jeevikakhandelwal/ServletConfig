package com.abc.controller;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletConfigDetailsApp extends GenericServlet {
	private static final long serialVersionUID = 1L;

	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		ServletConfig config = getServletConfig();
		
		String url = config.getInitParameter("url");
		System.out.println(url);
		
		Enumeration e = config.getInitParameterNames();
		System.out.println(e);
		
	    config.getServletName();
	}

}
