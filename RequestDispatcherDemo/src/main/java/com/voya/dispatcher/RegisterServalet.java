package com.voya.dispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/registerServlet")
public class RegisterServalet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServalet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// response.setContentType("text/html;")
		
		String employeename=request.getParameter("employeename");
		String city=request.getParameter("city");
		String sal=request.getParameter("sal");
		String mobile=request.getParameter("mobile");
		String course = request.getParameter("course");
		String[] hobbies=request.getParameterValues("hobbies");
		
		
		request.setAttribute("employeeName" ,employeename);
		request.setAttribute("city" ,city);
		request.setAttribute("employeeSalary" ,sal);
		request.setAttribute("employeeMobile" ,mobile);
		request.setAttribute("employeeCourse" ,course);
		request.setAttribute("employeeHobbies" ,hobbies);
		PrintWriter writer = response.getWriter();
		writer.print("This is from servlet<br>");
		
		RequestDispatcher dispatcher= request.getRequestDispatcher("success.jsp");
		dispatcher.forward(request,response);
		
	//	response.sendRedirect("sucess.jsp")

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
