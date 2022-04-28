package com.Exception;

import java.util.*;
import java.io.*;
class capgemini extends Exception
{
	
}

class Triangle
{
	double b,h;
	Triangle(double l,double m)
	{
		b=l;
		h=m;
	}
	public void area()throws capgemini
	{
		if(b<=0||h<=0)throw new capgemini();
		else
		System.out.println("Area is "+0.5*b*h);
	}
	
}
public class UserDefinedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Triangle object=new Triangle(-1,50);
          try
          {
        	 object.area(); 
          }
          catch(capgemini e)
          {
        	  System.out.println(e);
          }
          
	}

}
