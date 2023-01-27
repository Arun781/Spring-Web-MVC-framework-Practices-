package com.xworkz.kingBio.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 2, urlPatterns ="/king")
public class KingServlets extends HttpServlet {
	public KingServlets() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String kname=req.getParameter("KingName");
		String region=req.getParameter("Region:");
		String queens=req.getParameter("Queens");
		String dob=req.getParameter("birthday");
		String dod=req.getParameter("DOD");
		System.out.println(kname);
		System.out.println(region);
		System.out.println(queens);
		System.out.println(dob);
		System.out.println(dod);
		PrintWriter writer =resp.getWriter();	
		writer.print("KingName is "+kname+" is succesfully registred....");
		writer.print("region is "+region+" is succesfully registred....");
		writer.print("Num of queens "+queens+" is succesfully registred....");
		writer.print("dob is "+dob+" is succesfully registred....");
		writer.print("dod is "+dod+" is succesfully registred....");
		
		
		
	}

}
