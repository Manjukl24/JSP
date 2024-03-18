package com.doctor.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctor.model.Doctor;

/**
 * Servlet implementation class DoctorServlet
 */
@WebServlet("/DoctorServlet")
public class DoctorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoctorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("Name ");
		String exp= request.getParameter("experience");
		Integer experience = Integer.parseInt(exp);
		String Id =request.getParameter("doctorId");
		Integer doctorId = Integer.parseInt(Id);
		String Speciality = request.getParameter("speciality");
		String fee = request.getParameter("fees");
		double fees = Integer.parseInt(fee);

		Doctor doctor= new  Doctor();

		doctor.setDoctorId(doctorId);
		doctor.setExperience(experience);
		doctor.setDoctorName(name);
		doctor.setSpeciality(Speciality);
		doctor.setFees(fees);

		request.setAttribute("doctor", doctor);

		RequestDispatcher rd = request.getRequestDispatcher("docsuccess.jsp");
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
