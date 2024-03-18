package com.employeeapp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employeeapp.model.Employee;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/employeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		
String employeeName = request.getParameter("employeeName");
String employeeCity = request.getParameter("employeeCity");
Integer employeeId = Integer.parseInt(request.getParameter("employeeId"));
Double employeeSalary = Double.parseDouble(request.getParameter("employeeSalary"));
String employeeCourse = request.getParameter("employeeCourse");

Employee employee= new Employee();

employee.setEmployeeId(employeeId);
employee.setCity(employeeCity);
employee.setEmployeeName(employeeName);
employee.setEmployeeSalary(employeeSalary);
employee.setCourse(employeeCourse);

request.setAttribute("employeeObject", employee);

RequestDispatcher rd = request.getRequestDispatcher("employeeDetails.jsp");
rd.include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
