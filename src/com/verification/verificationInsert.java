package com.verification;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/verificationInsert")
public class verificationInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String bname = request.getParameter("busName");
		String btype = request.getParameter("busType");
		String maxs = request.getParameter("seats");
		String spoint = request.getParameter("startPoint");
		String stime = request.getParameter("startTime");
		String dpoint = request.getParameter("dropPoint");
		String dtime = request.getParameter("dropTime");
	
		boolean isTrue;

		isTrue = VerificationDButil.insertScheduler(bname, btype, maxs, spoint,stime,dpoint,dtime);
		
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("RetrieveSchedule.jsp");
			dis.forward(request,response);
		}else {
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}
	}

}
