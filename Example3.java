package com.BufferedReaderExample;
import java.io.*;
public class Example3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 2 numbers");
		long a,b,c;
		a=Long.parseLong(reader.readLine());
		b=Long.parseLong(reader.readLine());
		c=a-b;
		System.out.println("Result is: " +c);
	}

}
