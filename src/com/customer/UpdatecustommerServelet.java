package com.customer;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdatecustommerServelet
 */
@WebServlet("/Daniru/UpdatecustommerServelet")
public class UpdatecustommerServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		String phoneno = request.getParameter("phoneno");
		String city = request.getParameter("city");
		String qnt = request.getParameter("qnt");
		String Date = request.getParameter("date");	
		
		boolean isTrue=CustommerDButil.updatecustommer(id,fname,lname,email,phoneno,city,qnt,Date);
		
		try {
			List<Custommer> cusDetails = CustommerDButil.validate(email);
			request.setAttribute("cusDetails", cusDetails);
			}catch(Exception e) {
				e.printStackTrace();
			}
		
		if(isTrue==true) {
			RequestDispatcher dis = request.getRequestDispatcher("useraccount.jsp");
			dis.forward(request, response);
		}
		else {
			RequestDispatcher dis = request.getRequestDispatcher("unsuccsess.jsp");
			dis.forward(request, response);
		}
	}

}
