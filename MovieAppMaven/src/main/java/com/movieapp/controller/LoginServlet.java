package com.movieapp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		HttpSession session = request.getSession();
        PrintWriter writer = response.getWriter();
		writer.print(session.getId()+"<br>");
		writer.print(session.getCreationTime()+"<br>");
		writer.print(session.getMaxInactiveInterval()+"<br>");
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
	
		if(username.equals("Manjunath")&&password.equals("Manjunath")) {
			request.setAttribute("username",username);
			RequestDispatcher dispatcher= request.getRequestDispatcher("Success.jsp");
			dispatcher.include(request,response);
		}else {
			response.sendRedirect("index.jsp");
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
