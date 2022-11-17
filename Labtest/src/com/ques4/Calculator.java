/*
 * program:Calculator
 * @author:Rohit Kumar Bhagat
 * @date:17/11/22
 */
//declaring package

package com.ques4;

import java.util.*;

public class Calculator {
	
	private double n,m,sum,subs,multi,div;
	  
	  void get()
	  {  
		  try
		  {
			  Scanner sc = new Scanner(System.in);
			  System.out.println("Enter two numbers");
			  n = sc.nextInt();
			  m = sc.nextInt();
			  sum = n + m;
			  subs = n - m;
			  multi = n * m;
			  div = n / m;
			  System.out.println("sum of two no. : "+sum);
			  System.out.println("substraction of two no. : "+subs);
			  System.out.println("multiplication of two no. : "+multi);
			  System.out.println("division of two no. : "+div);
		  }
		  
		  catch( ArithmeticException | InputMismatchException e)
		  {
			  System.out.println(e.getMessage());
		  }
		 
	  }
	  public static void main (String args[])
	  {
		  Calculator i = new Calculator();
		  i.get();
 	  }

}
