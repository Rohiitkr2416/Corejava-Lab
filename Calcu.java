/*
program: Switch case
@author: Rohit Kumar Bhagat
@date:20.10.2022
*/

// declaring package
import java.util.Scanner;


//declaring class
class Calcu

{
	// method of square
	static void square(float n1)
	{
		
		float sq=n1*n1;
		System.out.println("The square of "+n1+" is:"+sq);
	}
	
	//method of cube
	static void cube(float n1)
	{
	
	
	     float cube=n1*n1*n1;
		System.out.println("The cube of "+n1+" is:"+cube);
		
	}
	//method of odd and even
	
	 static void oddeven(float n1)
	 {
		 
		 //starting if else
		 if((n1%2)==0)
			 System.out.println("The number"+n1+"is even");
		 else
			 
			 
	System.out.println("The number"+n1+"is odd");
	 }
	 // end of if else
	 
	 
	 
	 public static void main(String args[])
	 {
		 Scanner sc=new Scanner(System.in);
		 
		 //declaring data types
		 
		 float num1;
		 int option;
		 System.out.println("Enter the number");
		 
		 num1=sc.nextFloat();
		 System.out.println("1. Square");
		 System.out.println("2. cube");
		 System.out.println("3. Even or odd");
		 System.out.println("4. Exit");
		 System.out.println("Enter your option");
		 option=sc.nextInt();
		 
		 //switch started
		 switch(option)
		 {
			 case 1:square(num1);
			 break;
			 case 2:cube(num1);
			 break;
			 case 3:oddeven(num1);
			 break;
			 case 4:System.exit(0);
			 break;
			 default:System.out.println("input is wrong...!!!!!");
			 
			 
		 }// end switch
		 
		 
	 }  //end main
	 
	 
}  // end class
	
	
	
		
