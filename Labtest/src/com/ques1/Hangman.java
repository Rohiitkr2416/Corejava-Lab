/*
 * program:
 * @author:Rohit Kumar Bhagat
 * @date:17/11/22
 */
//declaring package

package com.ques1;
import java.util.*;
public class Hangman 
{
	public static void main(String args[])
	{
		String arr[] = new String[]{"ROHIT","LABTEST", "JAVA", "ANUDEEP", "RANCHI"};
		System.out.println("HEY !!!!...ARE YOU READY TO PLAY HANGMAN....");
		System.out.println("Select an array Index to choose words: ");
		System.out.println("Array Index should not be greater than 5");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int len = arr[n].length(); 
		System.out.println("Input your guessing: ");
		for(int i=0; i<len; i++)
		{
			System.out.print("_ ");
		}
		System.out.println();
		
		String a = sc.next().toUpperCase();
		if(a == arr[n])
		{
			System.out.println("Your Guess was correct");
		}
		else
		{
			System.out.println("You loose");
		}
		sc.close();
		
	}


}
