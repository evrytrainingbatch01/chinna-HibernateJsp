package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.PatientDao;
import com.daoImpl.PatientDaoImpl;
import com.evry.Patient;

/**
 * Servlet implementation class PatientController
 */
public class PatientController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	Patient p=new Patient();
	PatientDaoImpl pdao=new PatientDaoImpl();
	PatientDao dao;
	
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		
		if(request.getParameter("addPatient")!=null) {
		 String pname = request.getParameter("pname");
         int age = Integer.parseInt(request.getParameter("age"));
         String bgroup=request.getParameter("bgroup");
         String checkup=request.getParameter("checkup");
         String doctors=request.getParameter("doctors");
         String tcase=request.getParameter("tcase");
         
         p.setPname(pname);
         p.setAge(age);
         p.setBgroup(bgroup);
         p.setCheckup(checkup);
         p.setDoctors(doctors);
         p.setTcase(tcase);
         
         pdao.savePatient(p);
         RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
         rd.forward(request, response);
         
         out.print("successfully row inserted");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		List<Patient> listPatients = new ArrayList();
        listPatients=pdao.showPatients();
        request.setAttribute("listPatients", listPatients);
        if(request.getParameter("showPatients")!=null) {
        RequestDispatcher rd = request.getRequestDispatcher("showAll.jsp");
        rd.forward(request, response);
		}
	}

}
