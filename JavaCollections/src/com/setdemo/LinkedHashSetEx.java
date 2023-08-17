package com.setdemo;

import java.util.LinkedHashSet;

public class LinkedHashSetEx {

	public static void main(String[] args) {
		LinkedHashSet<String> lhm = new LinkedHashSet<>(10);

		lhm.add("A");
		lhm.add("C");
		lhm.add("E");
		lhm.add("K");
		lhm.add("B");
		lhm.add("G");
		lhm.add("B");

		lhm.forEach(System.out::println);
	}

}
