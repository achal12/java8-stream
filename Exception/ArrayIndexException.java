package com.Exception;

import java.io.*;
public class ArrayIndexException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a[]= {0,0};
      int x,y,z;
      x=100;
      y=0;
      try
      {
    	  //z=x/y;
    	  System.out.println(x/a[2]);
      }
      catch(ArrayIndexOutOfBoundsException ae)
      {
    	  System.out.println(ae);
      }
      catch(Exception e)
      {
    	  System.out.println(e);
      }
     
      
      finally
      {
    	  System.out.println("welcome to finally block");
      }
	}

}