package com.xworkz.webseries.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1, urlPatterns ="/series")
public class WebServlets extends HttpServlet {
	public WebServlets() {
		System.out.println("Created "+this.getClass().getSimpleName()+"No arg const.........");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running the doGet WebServlets.....");
		String name =req.getParameter("name");
		String lname =req.getParameter("lname");
		String ott =req.getParameter("fav_language");
		String quantity =req.getParameter("quantity");
		String budget =req.getParameter("Budget");
		System.out.println(name);
		System.out.println(lname);
		System.out.println(ott);
		System.out.println(quantity);
		System.out.println(budget);
		PrintWriter writer = resp.getWriter();
		System.out.println(writer);
		writer.print("Name "+name+" is sent success..");
		writer.print("______");
		writer.print("Language "+lname+" is added Successfully....");
		writer.print("______");
		writer.print("ott "+ott+" is added Successfully....");
		writer.print("______");
		writer.print("quantity "+quantity+" is added Successfully....");
		writer.print("______");
		writer.print("budget "+budget+" is added Successfully....");
	}

}
