package com.dest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Multiplication")

public class Multiplication extends HttpServlet {
	
	protected void service(HttpServletRequest req,
            HttpServletResponse resp ) {
		try {

int n1=Integer.parseInt(req.getParameter("n1"));
int n2=Integer.parseInt(req.getParameter("n2"));

int mul = n1 * n2;
int add =(int)req.getAttribute("add");
PrintWriter w = resp.getWriter();
w.println(mul);
w.println(add);
		}
		catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	
	}
}
