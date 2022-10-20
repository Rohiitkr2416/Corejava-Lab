/*
program: Age 
@author: Rohit Kumar Bhagat
@date:20.10.2022
*/


/*
program: Age 
@author: Rohit Kumar Bhagat
@date:20.10.2022
*/


import java.util.Scanner;

// declaring class
class Greater

{
	
	//declaring main
	public static void main(String args[])
	
	{
		Scanner sc=new Scanner(System.in);
		
		
		//declaring data types
		int age1, age2, age3;
		//taking inputs
		System.out.println("Enter the age of 1st person");
		age1=sc.nextInt();
		
		System.out.println("Enter the agr of 2nd person:");
		age2=sc.nextInt();
	
		System.out.println("Enter the age of 3rd person:");
		age3=sc.nextInt();
		
		//starting of else if
		
		if((age1>age2)&&(age1>age3))
		
			System.out.println("The oldest person is :"+age1);
			
			
		else if (age2>age3)
			System.out.println("The oldest person  is :"+age2);
		else
			System.out.println("the oldest person is :"+age3);
		
		
		if((age1<age2)&&(age1<age3))
		
			System.out.println("The Youngest person is :"+age1);
			
			
		else if (age2<age3)
			System.out.println("The Youngest person  is :"+age2);
		else
			System.out.println("the Youngest person is :"+age3);
		
		
	}   // end main
	
	
	
	
}// end class