package com.verification;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UpdateSchedulerServlet")
public class UpdateSchedulerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");
		String bname = request.getParameter("busName");
		String bType = request.getParameter("busType");
		String maxs = request.getParameter("seats");
		String Spoint = request.getParameter("startPoint");
		String Stime = request.getParameter("startTime");
		String Dpoint = request.getParameter("dropPoint");
		String Dtime = request.getParameter("dropTime");
		
		
		boolean isTrue;
		
		isTrue  = VerificationDButil.updateScheduler(id,bname, bType, maxs, Spoint, Stime, Dpoint, Dtime);
		
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("RetrieveSchedule.jsp");
			dis.forward(request, response);
		}
		else {
			RequestDispatcher dis = request.getRequestDispatcher("unsuccess.jsp");
			dis.forward(request, response);
		}
	}

}
