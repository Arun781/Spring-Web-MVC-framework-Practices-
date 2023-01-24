package com.xworkz.prosperity.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 3, urlPatterns = "/connect me")
public class BoostServlets extends HttpServlet {
public BoostServlets() {
	System.out.println("Running the no arg constructor BoostServlets.....");
}
@Override
	protected void doHead(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("Running the doHead BoostServlets");
	}
}
