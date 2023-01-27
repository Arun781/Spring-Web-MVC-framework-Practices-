package com.xworkz.uspolo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/signUp")
public class USPoloServlets extends HttpServlet {
	public USPoloServlets() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running the doGet in USPolo......");
		String container = req.getParameter("container");
		System.out.println(container);

		PrintWriter writer = resp.getWriter();
		writer.print(container);
	}
}
