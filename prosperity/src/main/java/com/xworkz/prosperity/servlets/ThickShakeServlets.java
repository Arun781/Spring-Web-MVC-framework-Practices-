package com.xworkz.prosperity.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 6, urlPatterns = "/send")
public class ThickShakeServlets extends HttpServlet {
public ThickShakeServlets() {
	System.out.println("Running the ThickShakeServlets");
}
@Override
	protected void doOptions(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("Running the doOptions ThickShakeServlets");
	}
}
