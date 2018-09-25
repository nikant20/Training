package com.opteamix.collection;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class TestMap {

	public static void main(String[] args) {
		Map<String, String> map1 = new LinkedHashMap<>();
		map1.put("username", "admin@opteamix.com");
		map1.put("password", "opteamix@1234");
		map1.put("url", "www.opteamix.com");
		
		String value = map1.get("Username");
		System.out.println("Username: "+value);
		value = map1.get("password");
		System.out.println("Password: "+value);
		
		// print complete map
		System.out.println(map1);
		
		//Key list
		 Set<String> keys = map1.keySet();
		 Iterator<String> itr = keys.iterator();
		 while (itr.hasNext()) {
			String key = (String) itr.next();
			System.out.println("Keys are: "+key);
		}
		//Remove url
		map1.remove("url");
		System.out.println(map1);
		
		for (String ke : keys) {
			System.out.println(ke);
		}
		
				

	}

}
