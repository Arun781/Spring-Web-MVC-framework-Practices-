package com.xworkz.selfplaced.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Self
 */
@WebServlet(loadOnStartup = 1, urlPatterns ="/selfMade")
public class SelfServlets extends HttpServlet {
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelfServlets() {
        super();
        System.out.println("Created "+getClass().getSimpleName());
    }
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String fname =req.getParameter("fname");
		String lname =req.getParameter("lname");
		String gender =req.getParameter("Gender");
		String reason =req.getParameter("reason");
		String textarea =req.getParameter("textarea");
		
		System.out.println("fname:-"+fname);
		System.out.println("lname:-"+lname);
		System.out.println("Gender:-"+gender);
		System.out.println("reason:-"+reason);
		System.out.println("textarea:-"+textarea);
		
//		PrintWriter writer = resp.getWriter();	
//		writer.print(fname);
//		writer.print(lname);
//		writer.print(gender);
//		writer.print(reason);
//		writer.print(textarea);
		
		RequestDispatcher dispatcher= req.getRequestDispatcher("Display.jsp");
		req.setAttribute("fname", fname);
		req.setAttribute("lname", lname);
		req.setAttribute("gender", gender);
		req.setAttribute("reason", reason);
		req.setAttribute("textarea", textarea);
		String temp ="the details of your fav person:-";
		System.out.println("Displaying"+temp);
		req.setAttribute("Display", temp);
		dispatcher.forward(req, resp);
	}

}
