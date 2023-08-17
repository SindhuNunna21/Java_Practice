package com.listdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> al1 = new ArrayList<>(20);
		ArrayList<Integer> al2 = new ArrayList<>(List.of(50, 60, 70, 80));
		al1.add(10);
		al1.add(0, 5);
		al1.addAll(2, al2);
		al1.add(2, 70);
		System.out.println(al1);
		System.out.println(al1.indexOf(70));
		System.out.println(al1.lastIndexOf(70));
		System.out.println(al1.contains(5));
		System.out.println(al1.get(5));
		al1.set(4, 90);
		System.out.println(al1);

		// Iterator method
		Iterator<Integer> it = al1.iterator(); // list iterator can also be used.
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// for-each loop
		for (Integer x : al1) {
			System.out.println(x);
		}

		// Lambda expression
		al1.forEach(n -> show(n));
	}

	static void show(int n) {
		if (n > 60)
			System.out.println(n);
	}

}
