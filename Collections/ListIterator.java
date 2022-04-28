package com.Collections;

import java.util.HashSet;

public class ListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> obj=new HashSet<String>();
		obj.add("capgemini");
		obj.add("infosys");
		obj.add("techm");
		obj.add("tcs");
		obj.add("cts");
		
		obj.forEach(companyName->System.out.println(companyName));
	}

}
