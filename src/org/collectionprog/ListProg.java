package org.collectionprog;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListProg {
	
	public static void main(String[] args) {
		
		// List syntax
	//   I    <CL>     ref    obj   <CL>
//		List<Integer> list1 = new ArrayList<>();
//		
//		list1.add(10);
//		list1.add(20);
//		list1.add(30);
//		list1.add(10);
//		list1.add(40);
//		list1.add(20);
//		list1.add(60);
//		list1.add(70);
//		
//		System.out.println(list1);
//		
		
				
	    List<Integer> list1 = new LinkedList<>();
	    
	    list1.add(60);
		list1.add(70);
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(10);
		list1.add(40);
		list1.add(20);
		
		
		System.out.println(list1);
		
		for (int i = 0; i <list1.size(); i++) {
			Integer integer = list1.get(i);
			System.out.println(integer);
		}
		

		
		
//        List<Integer> list2 = new ArrayList<>();
//		
//		list2.add(11);
//		list2.add(22);
//		list2.add(33);
//		list2.add(11);
//		list2.add(10);
//		list2.add(44);
//		
//		System.out.println(list2);
//		
//		// addAll
//		list1.addAll(list2);
//		System.out.println(list1);
//		
//		//retainAll -> to print common value
//		list1.retainAll(list2);
//		System.out.println(list1);
//		
//		//removeAll -> to print uncommon value
//		list1.removeAll(list2);
//		System.out.println(list1);
//		
//		
		
		
		
		
		
//		int size = list1.size();
//		System.out.println(size);
//		
//		Integer integer = list1.get(3);
//		System.out.println(integer);
//		
//		// work like insert
//		list1.add(5,55);
//		System.out.println(list1);
//		
//		
//		list1.remove(3);
//		System.out.println(list1);
//		
//		// work like replace / update
//		list1.set(4, 44);
//		System.out.println(list1);
//		
//		int indexOf = list1.indexOf(44);
//		System.out.println(indexOf);
//		
//		int lastIndexOf = list1.lastIndexOf(20);
//		System.out.println(lastIndexOf);
//		
		
		
		

//		 List list2 = new ArrayList();
//		 
//		 list2.add(10);
//		 list2.add("java");
//		 list2.add(true);
//		 list2.add(10);
//		 list2.add(6757.9664f);
//		
//		 
//		 System.out.println(list2);
//		 
//		 int size2 = list2.size();
//		 System.out.println(size2);
//		 
//		 //Object is a super class of all class
//		 Object object = list2.get(2);
//		 System.out.println(object);
//		
	}
}
