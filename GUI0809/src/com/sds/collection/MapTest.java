package com.sds.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> map = new HashMap<>();
		
		map.put("m1", "사과");
		map.put("m2", "포도");
		map.put("m4", "수박");
		map.put("m5", "딸기");
		
		
		//String name = map.get("m3");
		//System.out.println(name);
		
		Set<String> set = map.keySet();

		Iterator<String> it = set.iterator();
				
		while(it.hasNext()){
			String key = it.next();
			String fruit = map.get(key);
			System.out.println(fruit);
			
		}
		
	}

}
