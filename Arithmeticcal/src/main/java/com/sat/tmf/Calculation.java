package com.sat.tmf;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

 
public class Calculation extends HttpServlet {
	private static final long serialVersionUID = 1L;
     public Calculation() {
    	 super();
     }
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 PrintWriter pw =response.getWriter();
		 int number1 = Integer.parseInt(request.getParameter("num1"));
		 int number2 = Integer.parseInt(request.getParameter("num2"));
		 String operation =request.getParameter("operation");
		 int result;
		 switch (operation) {
		 case "+":
			 result = number1+number2;
			 break;
		 case "-":
			 result = number1-number2;
			 break;
		 case "*":
			 result = number1*number2;
			 break;
		 case "/":
			 result = number1/number2;
			 break;
			 default:
			 return;
		 }
		 // int sum = number1+number2;
		  pw.println("result is"+ number1+ ""+operation+""+number2+"="+result);
		 
		}
	

	}

 


