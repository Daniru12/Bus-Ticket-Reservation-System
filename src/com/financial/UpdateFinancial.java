package com.financial;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateFinancial
 */
@WebServlet("/UpdateFinancial")
public class UpdateFinancial extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("payment-id");
		String name = request.getParameter("payment-name");
		String phone = request.getParameter("contact-no");
		String method = request.getParameter("payment-method");
		String noTiket = request.getParameter("no-of-tickets");
		String price = request.getParameter("price-per-ticket");
		String amount = request.getParameter("amount");
		
		
		boolean isTrue;
		
		isTrue  = FinancialDBUtil.updatefinancial(id,name, phone, method, noTiket, price, amount);
		
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("RetrieveFinancial.jsp");
			dis.forward(request, response);
		}
		else {
			RequestDispatcher dis = request.getRequestDispatcher("unsuccess.jsp");
			dis.forward(request,response);
		}
	}

}