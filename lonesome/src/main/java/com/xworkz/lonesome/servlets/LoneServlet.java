package com.xworkz.lonesome.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 3,urlPatterns = "/lonesom")
public class LoneServlet extends HttpServlet {
	public LoneServlet() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running the doGet in LoneServlet......");
		
		String fname =req.getParameter("firstname");
		String mname=req.getParameter("middlename");
		String lname=req.getParameter("lastname");
		String mail=req.getParameter("Gmail");
		String location=req.getParameter("location");
		String bday=req.getParameter("birthday");
		String dist=req.getParameter("Dist");
		String state=req.getParameter("State:");
		String country=req.getParameter("Country");
		String nationality=req.getParameter("Nationality");
		String lang=req.getParameter("Languages");
		String status = req.getParameter("marital_status");
		String gender = req.getParameter("Gender");
		String code = req.getParameter("country_code");
		String phone = req.getParameter("phone");
		String skills = req.getParameter("describe your skills");
		String pass = req.getParameter("pass");
		String repass = req.getParameter("repass");
		
		System.out.println(fname);
		System.out.println(mname);
		System.out.println(lname);
		System.out.println(mail);
		System.out.println(location);
		System.out.println(bday);
		System.out.println(dist);
		System.out.println(state);
		System.out.println(country);
		System.out.println(nationality);
		System.out.println(lang);
		System.out.println(fname);
		System.out.println(gender);
		System.out.println(code);
		System.out.println(phone);
		System.out.println(skills);
		System.out.println(pass);
		System.out.println(repass);

		
		PrintWriter writer = resp.getWriter();
		writer.print(fname);
		writer.print(mname);
		writer.print(lname);
		writer.print(mail);
		writer.print(location);
		writer.print(bday);
		writer.print(dist);
		writer.print(state);
		writer.print(country);
		writer.print(nationality);
		writer.print(lang);
		writer.print(gender);
		writer.print(code);
		writer.print(phone);
		writer.print(skills);
		writer.print(pass);
		writer.print(repass);

		}
}
