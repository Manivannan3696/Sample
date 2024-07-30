package org.collectionprog;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetProg {
	
	public static void main(String[] args) {
		
		// LinkedHashSet -> print in insertion order
		Set<Integer> se1 = new LinkedHashSet<>();
		
//		//HashSet -> random order
//		Set<Integer> se1 = new HashSet<>();
//		
//		//TreeSet -> ascending order 
//    	Set<Integer> se1 = new TreeSet<>();
		
		se1.add(10);
		se1.add(20);
		se1.add(30);
		se1.add(10);
		se1.add(40);
		se1.add(50);
		se1.add(20);
		se1.add(60);
		
		System.out.println(se1);
		
//		int size = se1.size();
//		System.out.println(size);
		
		// set will work only on for each /enhanced for
		// for each -> value based for loop
		
	    for (Integer integer : se1) {
			System.out.println(integer);
		}
		
		
	}

}
