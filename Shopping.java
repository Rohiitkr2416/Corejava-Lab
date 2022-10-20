/*
program: Shopping
@author: Rohit Kumar Bhagat
@date:20.10.2022
*/


import java.util.Scanner;
 // declaring class
 class Shopping
 
 {
	
	 static void clcBill(float qty)
	 {
		 
		 //declaring data type
		 float tot, dis, price;
		 
		 
		 
		 
		 
		 
	   //calculatind  totalprice
	   price=540*qty;
		
		System.out.println("Your total price is:"+price);
		//starting if else
		if(price>=2000)
		{
			//calculating discount
			dis= (price*10)/100;
			tot=price-dis;
			//printing total price
			System.out.println("The amount to be paid is:"+tot);
		}
		else 
			System.out.println("The amount to be paid is:"+price);
	 //end if else
 }
 
      
  // main started
	 public static void main(String args[])
	 {
	 Scanner sc=new Scanner(System.in);
	 float qty;
	 
	 //taking input
	 System.out.println("Enter the quantity :");
	 qty=sc.nextFloat();
	 //calling method
	 clcBill(qty);
	 
	 }//end main
	 
	 
	 } //end of class
			