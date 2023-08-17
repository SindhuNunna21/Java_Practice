package com.setdemo;

import java.util.List;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		/*
		 * reference of any interface can be taken but we can call methods which are
		 * present only in that interface
		 */

		TreeSet<Integer> ts = new TreeSet<>(List.of(10, 30, 50, 70, 10, 40));
		ts.add(25);
		System.out.println(ts);
		System.out.println(ts.ceiling(55));

	}

}
