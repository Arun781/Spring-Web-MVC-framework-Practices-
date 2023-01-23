package com.xworkz.prosperity.servlets;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
@WebServlet(loadOnStartup = 4, urlPatterns = "/contact me")
public class MilkShakeServlet extends HttpServlet {
public MilkShakeServlet() {
	System.out.println("Created the no arg MilkShakeServlet....");
}
@Override
	public void destroy() {
		System.out.println("Running the MilkShakeServlet Destroy..");
	}
}
