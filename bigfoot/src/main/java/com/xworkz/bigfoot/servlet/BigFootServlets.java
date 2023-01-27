package com.xworkz.bigfoot.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/Metro")
public class BigFootServlets extends HttpServlet {
	public BigFootServlets() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Runninf the BigFootServlets");
		String name = req.getParameter("firstname");
		System.out.println(name);
	}

}
