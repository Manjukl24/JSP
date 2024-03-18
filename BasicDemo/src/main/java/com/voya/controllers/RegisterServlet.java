package com.voya.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;")
		String city=request.getParameter("city");
		String employeename=request.getParameter("employeename");
		String sal=request.getParameter("sal");
		double salary=Double.parseDouble(sal);
		String mobile=request.getParameter("mobile");
		long mob=Long.parseLong(mobile);
		PrintWriter writer=response.getWriter();
		writer.print("<html><body>");
		writer.print("Welcome"+ employeename+"<br>");
		writer.print("Your City is"+city+"<br>");
		writer.print("Your salary is"+salary+"<br>");
		writer.print("Your mobile Number is "+mob+"<br>");
		writer.print("<html><body>");
		
		String[] hobbies=request.getParameterValues("hobbies");
		for(String hobby:hobbies) {
			writer.print("your hobbies are " +hobby);
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
