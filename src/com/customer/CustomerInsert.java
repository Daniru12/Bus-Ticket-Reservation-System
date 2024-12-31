package com.customer;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/insert")
public class CustomerInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fname = request.getParameter("first");
		String lname = request.getParameter("last");
		String email = request.getParameter("email");
		String no = request.getParameter("no");
		String city = request.getParameter("city");
		String qnt = request.getParameter("qnt");
		String date = request.getParameter("date");
		
		boolean istrue;
		
		istrue = CustommerDButil.insertcustomer(fname, lname, email, no, city, qnt, date);
		
		

		try {
			List<Custommer> cusDetails = CustommerDButil.validate(email);
			request.setAttribute("cusDetails", cusDetails);
			}catch(Exception e) {
				e.printStackTrace();
			}
		
		if(istrue==true) {
			RequestDispatcher dis = request.getRequestDispatcher("useraccount.jsp");
			dis.forward(request, response);
		}
		else {
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccsess.jsp");
			dis2.forward(request, response);
		}
	}

}
