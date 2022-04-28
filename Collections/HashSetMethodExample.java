package com.Collections;
import java.util.*;
public class HashSetMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet obj=new HashSet();
		obj.add("apple");
		obj.add("banana");
		obj.add("grapes");
		obj.add("watermelon");
		obj.add("orange");
		System.out.println(obj);
		System.out.println("Collection is empty? :" +obj.isEmpty());
		obj.remove("grapes");
		System.out.println(obj);
		
		obj.add("capgemini");
		obj.add("ibm");
		obj.add("infosys");
		System.out.println("Size of the collection object is "+obj.size());
		System.out.println("Check particular elements present or not : "+obj.contains("apple"));
		obj.clear();
		System.out.println(obj);
	}

}
