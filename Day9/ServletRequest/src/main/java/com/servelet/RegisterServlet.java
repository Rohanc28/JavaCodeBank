package com.servelet;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class RegisterServlet extends HttpServlet {
	@Override 
	protected void doGet (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		PrintWriter pw =res.getWriter();
		res.setContentType("text/html");
		String name = req.getParameter("name");
		String dob = req.getParameter("dob");
		String email = req.getParameter("email");
		String gender = req.getParameter("gender");
		String level = req.getParameter("level");
		pw.println("name: "+name+"<br>");
		pw.println("dob: "+dob+"<br>");
		pw.println("email: "+email+"<br>");
		pw.println("gender: "+gender+"<br>");
		pw.println("level: "+level+"<br>");
		pw.close();
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		doGet(req,res);
	}


}
