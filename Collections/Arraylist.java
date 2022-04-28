package com.Collections;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList obj=new ArrayList();
		obj.add("Java");
		obj.add("python");
		obj.add("c");
		obj.add("c++");
		obj.add("php");
		obj.add(".net");
		System.out.println(obj);
		System.out.println("----------");
		
		obj.add(2,"mysql");
		System.out.println(obj);
		System.out.println("-------");
	}

}
