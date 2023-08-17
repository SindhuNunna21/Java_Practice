package com.mapdemo;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<>(Map.of(0, "A", 1, "B", 2, "C", 3, "D"));
		System.out.println(tm);

		tm.put(4, "E");
		tm.put(5, "F");
		System.out.println(tm);

		System.out.println(tm.ceilingEntry(5).getValue());
		System.out.println(tm.get(3));

		Entry<Integer, String> e = tm.firstEntry();
		System.out.println(e.getKey() + " " + e.getValue());

	}

}
