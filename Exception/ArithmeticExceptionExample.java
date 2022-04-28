package com.Exception;

import java.util.Scanner;

public class ArithmeticExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner s=new Scanner(System.in);
		try
		{
			System.out.println("Enter two numbers");
			 a=s.nextInt();
			 b=s.nextInt();
		      c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Cannot divide by zero"+e);
		}
		

	}

}