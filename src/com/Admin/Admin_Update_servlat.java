package com.Admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "Admin_Update_Servlat", urlPatterns = { "/Admin_Update_Servlat" })
public class Admin_Update_servlat extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");
		String bus_name = request.getParameter("bus_name");
		String bus_type = request.getParameter("bus_type");
		String seatNo = request.getParameter("seatNo");
		String date = request.getParameter("date");
		String destination = request.getParameter("destination");
		
		boolean isTrue;
		
		isTrue = AdminDButil.updateadmin(id, name, phone, bus_name, bus_type, seatNo, date, destination);
		
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("Admin_retrieve.jsp");
			dis.forward(request,response);
		}else {
			RequestDispatcher dis = request.getRequestDispatcher("unsuccess.jsp");
			dis.forward(request, response);
		}
		
	}

}
