package com.BufferedReaderExample;
import java.io.*;

public class Example1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 2 numbers");
		byte a,b,c;
		a=Byte.parseByte(reader.readLine());
		b=Byte.parseByte(reader.readLine());
		c=(byte) (a+b);
		System.out.println("Result is: " +c);
	}

}
