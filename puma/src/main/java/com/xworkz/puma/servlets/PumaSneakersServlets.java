package com.xworkz.puma.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 2, urlPatterns = "/location")
public class PumaSneakersServlets extends HttpServlet {
	public PumaSneakersServlets() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running the doPost PumaSneakersServlets.");
		String fname = req.getParameter("firstname");
		String gmail = req.getParameter("Gmail");
		String spoint = req.getParameter("Start-point");
		String dpoint = req.getParameter("Destination-Point");
		String gender = req.getParameter("gender");

		System.out.println(fname);
		System.out.println(gmail);
		System.out.println(spoint);
		System.out.println(dpoint);
		System.out.println(gender);

		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		if (fname.length() > 3 && gmail.length() > 3 && spoint.length() > 3 && dpoint.length() > 3) {
			writer.print("<span style='color:Yellow'>");
			writer.print("Sign up succesfully");
			writer.print("</span>");
		} else {
			writer.print("<span style='color:blue'>");
			writer.print("Please provide valid Company information");
			writer.print("</span>");
		}
		writer.print("</h1>");
		writer.print("<a href=\"index.html\">Home page</a>");
		writer.print("<br>");
		writer.print("<a href=\"location.html\">Location page</a>");
		writer.print("</body>");
		writer.print("</html>");
		resp.setContentType("text/html");
	}
}
