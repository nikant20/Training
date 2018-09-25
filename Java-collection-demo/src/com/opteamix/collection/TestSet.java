package com.opteamix.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSet {

	public static void main(String[] args) {
		Set<String> stringSet = new HashSet<>();
		stringSet.add("Nikant");
		stringSet.add("Prabhudeep");
		stringSet.add("Amulya");
		stringSet.add("Puneet");
		stringSet.add("Puneet");
		System.out.println("Set of Names: "+stringSet);
		//Remove the names
		Iterator<String> it = stringSet.iterator();
		while (it.hasNext()) {
			String name = it.next();
			if(name.equals("Puneet") || name.equals("Amulya")) {
				it.remove();
			}
		}
		System.out.println("Set of names after remove: "+stringSet );

	}

}
