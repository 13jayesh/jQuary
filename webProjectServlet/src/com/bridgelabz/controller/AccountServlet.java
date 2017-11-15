package com.bridgelabz.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest Request, HttpServletResponse Response)
			throws ServletException, IOException {

		Response.setContentType("text/html");
		PrintWriter out = Response.getWriter();
		String firstname = Request.getParameter("name");
		String lastname = Request.getParameter("name");
		String username = Request.getParameter("username");
		String password = Request.getParameter("password1");
		String month = Request.getParameter("month");
		String day = Request.getParameter("Date");
		String year = Request.getParameter("YEAR");
		String gender = Request.getParameter("ambox1");
		String number = Request.getParameter("number");
		String currentemail = Request.getParameter("mail");
		String location = Request.getParameter("Location1");

		System.out.println(firstname);
		try {
			/**
			 * Servlet implementation class servletprog
			 */
			Class.forName("com.mysql.jdbc.Driver");
			Connection object = DriverManager.getConnection("jdbc:mysql://localhost:3306/Mydata", "root", "root");
			PreparedStatement pst = object.prepareStatement(
					"insert into mailids(firstname,lastname,username,password,month,day,year,gender,number,currentemail,location) values(?,?,?,?,?,?,?,?,?,?,?)");
			pst.setString(1, firstname);
			pst.setString(2, lastname);
			pst.setString(3, username);
			pst.setString(4, password);
			pst.setString(5, month);
			pst.setString(6, day);
			pst.setString(7, year);
			pst.setString(8, gender);
			pst.setString(9, number);
			pst.setString(10, currentemail);
			pst.setString(11, location);

			int i = pst.executeUpdate();
           out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void doPost(HttpServletRequest Request, HttpServletResponse Response) throws IOException, ServletException {
		doGet(Request, Response);

	}

}