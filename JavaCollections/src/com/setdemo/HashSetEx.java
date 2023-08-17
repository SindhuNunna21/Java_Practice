package com.setdemo;

import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {
		HashSet<Integer> hs1 = new HashSet<>();
		hs1.add(10);
		hs1.add(20);
		hs1.add(30);
		hs1.add(10);

		System.out.println(hs1);

		HashSet<Integer> hs2 = new HashSet<>(20, 0.25f);
		hs2.add(10);
		hs2.add(20);
		hs2.add(30);
		hs2.add(40);
		hs2.add(50);
		hs2.add(60);

		System.out.println(hs2);

	}

}
