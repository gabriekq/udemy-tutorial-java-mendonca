package com.mendonca.part4;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class App2 {

	public static void main(String[] args) {
		
		Map<String,Integer> map = new LinkedHashMap<>();
		
		map.put("aaa", 1);
		map.put("bbb", 2);
		map.put("ccc", 3);
		map.put("ddd", 4);
		map.put("eee", 5);
		map.put("fff", 6);
		map.put("ggg", 7);
		map.put("hhh", 8);
		map.put("iii", 9);
		map.put("jjj", 10);
		map.put("kkk", 11);
		map.put("lll", 12);
		map.put("mmm", 13);
		
	//	for(String key : map.keySet()) {
		//	System.out.println(key+" - "+map.get(key));
	//	}
		

		TreeMap<Integer,String> map2 = new TreeMap<>(Comparator.reverseOrder());
		map2.put(10, "ten");
		map2.put(3, "Three");
		map2.put(5, "five");
		map2.put(1, "one");
		map2.put(8, "eight");
		
		System.out.println( map2.lastKey());
		
		System.out.println( map2.firstKey());
		
		for(  Entry<Integer, String> value  :map2.entrySet()  ) {
			System.out.println(value.getKey()+"  "+value.getValue());
		}
		
		
	}

}
