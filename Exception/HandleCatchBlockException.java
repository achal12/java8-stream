package com.Exception;

import java.util.*;
import java.io.*;
public class HandleCatchBlockException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    try
    {
    	int a=10/0;
    }
    catch(Exception e) 
    {
    	e.printStackTrace();
    	System.out.println(e.toString());
    	System.out.println(e.getMessage());
    }
	}

}