package com.bridgelabz.controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;



/**
 * Servlet implementation class servletprog
 */

public class servletprog extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servletprog() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest Request, HttpServletResponse Response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Response.setContentType("Text/html");
		PrintWriter out=Response.getWriter();
		String name=Request.getParameter("Email");  
		System.out.println("agda: "+name);
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection object =  DriverManager.getConnection("jdbc:mysql://localhost:3306/Mydata","root","root");
		PreparedStatement pst =  object.prepareStatement("select username from mailids");
		ResultSet rs=pst.executeQuery();
		while(rs.next())
		{
			String valuser=rs.getString("username");
			System.out.println(valuser);
			if(name.equals(valuser))
			{
				System.out.println("its valid id");
		        RequestDispatcher rd=Request.getRequestDispatcher("validpassword.html");  
		        rd.forward(Request, Response);
			}
			else
			{
				
				System.out.println("please type a valid id");
			}
		}
		
	} catch (Exception e) {
		
	}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */


	public void doPost(HttpServletRequest Request,HttpServletResponse Response) throws IOException
	{
	}
}
		
