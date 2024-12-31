package com.financial;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteFinancialServelet
 */
@WebServlet("/DeleteFinancialServelet")
public class DeleteFinancialServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("payment-id");
		
		boolean isTrue;
		
		isTrue = FinancialDBUtil.deletefinancial(id);
		
		if(isTrue==true) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("RetrieveFinancial.jsp");
			
			dispatcher.forward(request, response);
			
		}
		else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("unsuccess.jsp");
			
			dispatcher.forward(request, response);
		}
	}

}
