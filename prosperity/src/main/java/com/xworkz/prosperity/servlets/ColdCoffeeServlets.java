package com.xworkz.prosperity.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 5, urlPatterns = "/checkme")
public class ColdCoffeeServlets extends HttpServlet {
	public ColdCoffeeServlets() {
		System.out.println("Running the no arg constructor ColdCoffeeServlets......");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, 
	IOException {
		System.out.println("Running doGet in ColdCoffeeServlets");
	}

}
