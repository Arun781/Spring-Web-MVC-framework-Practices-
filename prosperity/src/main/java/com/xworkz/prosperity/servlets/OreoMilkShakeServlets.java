package com.xworkz.prosperity.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 7,urlPatterns = "/sent")
public class OreoMilkShakeServlets extends HttpServlet {
public OreoMilkShakeServlets() {
	System.out.println("Running the no arg constructor OreoMilkShakeServlets");
}
@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running the doPut OreoMilkShakeServlets");
	}
}
