package com.example.web;

import com.example.model.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ToonHandler extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException{
		String name = new String(request.getParameter("name"));
		int color = Integer.parseInt(request.getParameter("color"));
		int quote = Integer.parseInt(request.getParameter("quote"));
		int motive = Integer.parseInt(request.getParameter("motive"));

		String msg = CartoonExpert.cartoonGenius(name,color,quote,motive);

		request.setAttribute("message",msg);
		RequestDispatcher view = request.getRequestDispatcher("Result.jsp");
		view.forward(request,response);
	}
}