package com.bridgelabz.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.Response;

/**
 * Servlet implementation class servlvalidpass
 */

public class servlvalidpass2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servlvalidpass2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest Request, HttpServletResponse Response) throws ServletException, IOException 
	{
		Response.setContentType("Text/html");
		PrintWriter out=Response.getWriter();
		String name6=Request.getParameter("Email");  
		System.out.println("agdaxxxxx: "+name6);
	
		try
		{
			  HttpSession session=Request.getSession();  
		       session.getAttribute("username"); 	
		       String uName=(String)session.getAttribute("username");
		       System.out.println("shdrfh"+uName);
		       
		Class.forName("com.mysql.jdbc.Driver");
		Connection object =  DriverManager.getConnection("jdbc:mysql://localhost:3306/Mydata","root","root");
		PreparedStatement pst =  object.prepareStatement("select password from mailids where username= '"+uName+"'");
		ResultSet rs=pst.executeQuery();
		while(rs.next())
		{
			String valuser=rs.getString("password");
			System.out.println(valuser);
			if(name6.equals(valuser))
			{
				System.out.println("its valid password");
		        RequestDispatcher rd=Request.getRequestDispatcher("NewFile1.html");  
		        rd.forward(Request, Response);
			}
			else
			{
				
				System.out.println("please type a valid password");
			}
		}
		
	} catch (Exception e) {
		
	}
	}	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
