package org.collectionprog;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapProg {
	
	public static void main(String[] args) {
		
		
//		Map<Integer,String> map = new LinkedHashMap< >();
		
//		Map<Integer,String> map = new TreeMap < >();
		
//		Map<Integer,String> map = new HashMap<>();
		
		Map<Integer,String> map = new Hashtable < >();
				
		
		map.put(10,"java");
		map.put(20,"selenium"); 
		map.put(30,"sql");
		map.put(10,"java");
		map.put(40,"java");
		map.put(50,"framework");
		map.put(20,"project");
		map.put(60,"java");
		
		
		System.out.println(map);
		
		int size = map.size();
		System.out.println(size);
		
		boolean containsKey = map.containsKey(40);
		System.out.println(containsKey);
		
		boolean containsValue = map.containsValue("Framework");
		System.out.println(containsValue);
		
		String string = map.get(20);
		System.out.println(string);
		
		Set<Integer> keySet = map.keySet();
		System.out.println(keySet);
		
		for (Integer integer : keySet) {
			System.out.println(integer);
			
		}
		
		Collection<String> values = map.values();
		System.out.println(values);
		
		for (String string2 : values) {
			System.out.println(string2);
			
		}
		
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry);
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
//	    Map<Integer,String> map = new Hashtable < >();
//				
//		
//		map.put(10,"java");
//		map.put(20,null); 
//		map.put(30,"sql");
//		map.put(null,null);
//		map.put(40,"java");
//		map.put(50,"framework");
//		map.put(20,null);
//		map.put(60,"java");
//		
//		
//		System.out.println(map);
//	
		
	}

}
