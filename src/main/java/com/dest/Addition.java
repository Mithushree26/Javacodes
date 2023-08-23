package com.dest;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("Addition")

public class Addition  extends HttpServlet {

	protected void service(HttpServletRequest req,
			               HttpServletResponse resp ) {
		try {
		
		int n1=Integer.parseInt(req.getParameter("n1"));
		int n2=Integer.parseInt(req.getParameter("n2"));
		
		int add = n1 + n2;
		req.setAttribute("add_temp",add);
		RequestDispatcher d = req.getRequestDispatcher("Multipliaction");
		d.forward(req,resp);
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
	}

}


