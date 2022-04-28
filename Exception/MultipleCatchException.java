package com.Exception;

import java.util.*;
import java.io.*;

public class MultipleCatchException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		try {
			System.out.println("enter any one number:");
			int n=s.nextInt();
			if(10/n==0)
				System.out.println("Divide the value of 10:"+n);
		}
		catch(NumberFormatException | ArithmeticException e) {
			System.out.println(e);
			
		}

	}

}
