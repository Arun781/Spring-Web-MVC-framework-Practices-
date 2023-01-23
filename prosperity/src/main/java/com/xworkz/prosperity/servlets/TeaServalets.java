package com.xworkz.prosperity.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 2, urlPatterns = "/callme")
public class TeaServalets extends HttpServlet {
	public TeaServalets() {
		System.out.println("Running the no arg constructor TeaServalets");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Runnig the doGet TeaServalets");
	}

}
