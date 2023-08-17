package com.mapdemo;

import java.util.LinkedHashMap;

public class LinkedHashMapEx {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lhm1 = new LinkedHashMap<>(5);

		lhm1.put(1, "A");
		lhm1.put(2, "B");
		lhm1.put(3, "C");
		lhm1.put(4, "D");
		lhm1.put(5, "E");
		lhm1.put(6, "F");
		lhm1.put(9, "I");
		lhm1.put(8, "H");

		lhm1.forEach((k, v) -> System.out.println(k + " " + v));

		LinkedHashMap<Integer, String> lhm2 = new LinkedHashMap<>(5, 0.75f, true);// Least recently accessed

		String s = lhm2.get(2);
		s = lhm2.get(5);
		s = lhm2.get(1);
		lhm2.forEach((k, v) -> System.out.println(k + " " + v));

	}

}
