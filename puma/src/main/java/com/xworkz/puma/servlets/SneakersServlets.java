package com.xworkz.puma.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/contact")
public class SneakersServlets extends HttpServlet {
	public SneakersServlets() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Running the init in SneakersServlets");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running the doGet in SneakersServlets......");
		String first = req.getParameter("firstname");
		String mail = req.getParameter("Gmail");
		String phone = req.getParameter("phone");
		String comments = req.getParameter("Comments");
		System.out.println(first);
		System.out.println(mail);
		System.out.println(phone);
		System.out.println(comments);
		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		if (first.length() > 3 && mail.length() > 3 && comments.length() > 3) {
			writer.print("<span style='color:green'>");
			writer.print("Sign up succesfully");
			writer.print("</span>");
		} else {
			writer.print("<span style='color:red'>");
			writer.print("Please provide valid information");
			writer.print("</span>");
		}
		writer.print("</h1>");
		writer.print("<a href=\"index.html\">Home page</a>");
		writer.print("<br>");
		writer.print("<a href=\"contact.html\">Contact page</a>");
		writer.print("</body>");
		writer.print("</html>");
		resp.setContentType("text/html");
	}
}
