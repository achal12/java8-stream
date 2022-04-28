package com.Exception;

import java.util.*;
import java.io.*;
public class ThrowKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner s=new Scanner(System.in);
		try
		{
			System.out.println("enter 2 numbers :");
			a=s.nextInt();
			b=s.nextInt();
			if(b==0) throw new Exception();
			c=a/b;
			System.out.println(c);
      
		}
		catch(Exception e)
		{
			System.out.println("cannot divide by zero");
		}
		finally
		{
			s.close();
			System.out.println("Done");
		}
  
	}

}