package com.sachi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{

public void service(HttpServletRequest req,HttpServletResponse res) throws IOException{
	int firstNum=Integer.parseInt(req.getParameter("firstNum"));
	int secondNum=Integer.parseInt(req.getParameter("secondNum"));
	int add=firstNum+secondNum;
	PrintWriter out=res.getWriter();
    out.println("Result is : " + add);	
}
}
