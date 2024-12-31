package com.customer;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class deleteCustomerservelet
 */
@WebServlet("/Daniru/deleteCustomerservelet")
public class deleteCustomerservelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String id = request.getParameter("id");  
		 boolean isTrue;
		 
		 isTrue=CustommerDButil.deleteCustomer(id);
		 
		 if(isTrue==true) {
			RequestDispatcher dis = request.getRequestDispatcher("ticketstatus.jsp");
			dis.forward(request, response);
		}
		else {
			RequestDispatcher dis = request.getRequestDispatcher("unsuccsess.jsp");
			dis.forward(request, response);
			}
	}

}
