package com.Collections;

import java.util.*;
import java.util.ListIterator;

public class RetrieveElementsArrayList {

	public static void main(String[] args) {
		 ArrayList<String> obj =new ArrayList<>();
			obj.add("java");
			obj.add("spring");
			obj.add("git");
			obj.add("gradle");
			
			
			 for(int i=0;i<obj.size();i++) 
			 {
				 System.out.println(obj.get(i));
			 }
			 System.out.println("\n");
			 for(String str:obj)
			 {
				 System.out.println(str);
			 }
			 System.out.println("\n");
			Iterator<String> itr= obj.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			 System.out.println("\n");
			ListIterator<String> Itr=obj.listIterator();
			while(itr.hasNext())
			{
				System.out.println(Itr.next());
			}
			System.out.println("Backward Direction");
			while(Itr.hasPrevious())
			{
				System.out.println(Itr.previous());
			}
			System.out.println("----------------------------------");
			//foreach()
			{
				obj.forEach(course->System.out.println(course));
		    }
		}
		}