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
import javax.servlet.http.HttpSession;
import javax.xml.ws.Response;


/**
 * Servlet implementation class servletprog
 */
public class jsppassword extends HttpServlet {

       
    /**
	 * 
	 */
	private static final long serialVersionUID = -6215603549475934321L;
	/**
     * @see HttpServlet#HttpServlet()
     */
    public jsppassword() {
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
		String name8=Request.getParameter("Email");  
		System.out.println("agda: "+name8);
			
				HttpSession session=Request.getSession();  
				   session.setAttribute( "theName", name8 );  
		        RequestDispatcher rd=Request.getRequestDispatcher("jsppasswww.jsp");  
		        rd.forward(Request, Response);
			
	}
	/**}
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */


	public void doPost(HttpServletRequest Request,HttpServletResponse Response) throws IOException
	{
	}
}
		
