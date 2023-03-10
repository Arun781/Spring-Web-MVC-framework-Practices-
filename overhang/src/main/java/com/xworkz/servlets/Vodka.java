package com.xworkz.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/stick_in")
public class Vodka extends HttpServlet {
	public Vodka() {
		System.out.println("Creating the Vodka no arg const.....");
	}
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Running init of Onboarding..");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running the doGet Vodka.....");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Posting the data Vodka");
		String data = "Orange,Greean apple, SprinOff,Coffee,Best Grapefruit,Finlandia Grapefruit Vodka,Effen Blood Orange.";
		PrintWriter writer = resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");
	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Putting the doPut in Vodka");
		String data1 = "Best Peach,Ciroc Peach.";
		PrintWriter writer = resp.getWriter();
		writer.print(data1);
		resp.setContentType("text/plain");
	}

	@Override
	protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running the doOption in Vodka");
		String data2 = "Best Peach,Ciroc Peach.";
		PrintWriter writer = resp.getWriter();
		writer.print(data2);
		resp.setContentType("text/plain");
	}

	@Override
	protected void doTrace(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("Running the doTrace in Vodka");
	}

	@Override
	protected void doHead(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("Running the doHead in Vodka");
	}

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running the doDelete in Vodka");
	}
}
