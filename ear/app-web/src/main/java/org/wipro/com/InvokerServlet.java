package org.wipro.com;

import java.io.IOException;

import javax.ejb.EJB;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

/**
 * 
 * Servlet implementation class InvokerServlet
 */

@WebServlet({ "/InvokerServlet", "/invoke" })
public class InvokerServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private @EJB HelloBean hellobean;

	protected void doGet(HttpServletRequest request,

	HttpServletResponse response) throws ServletException, IOException {

	}

	/**
	 * 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	protected void doPost(HttpServletRequest request,

	HttpServletResponse response) throws ServletException, IOException {
		String fName = request.getParameter("fname");
		String lName = request.getParameter("lname");
		UserDetail userDetail = hellobean.getUserDetails(fName, lName);

		request.setAttribute("userDetail", userDetail);

		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}
