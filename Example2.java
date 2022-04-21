package com.BufferedReaderExample;
import java.io.*;

public class Example2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 2 numbers");
		short a,b,c;
		a=Short.parseShort(reader.readLine());
		b=Short.parseShort(reader.readLine());
		c=(short) (a+b);
		System.out.println("Result is: " +c);
	}
}
