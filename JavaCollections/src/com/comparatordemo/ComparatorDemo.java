package com.comparatordemo;

import java.util.Arrays;
import java.util.Comparator;

class My implements Comparator<Integer> {
	public int compare(Integer i1, Integer i2) {
		if (i1 < i2)
			return 1;
		if (i1 > i2)
			return -1;
		return 0;

	}
}

public class ComparatorDemo {

	public static void main(String[] args) {
		int a1[] = { 2, 4, 6, 8, 1, 3, 5, 7 };
		int b1[] = { 2, 4, 6, 8, 1, 3, 5, 7 };
		System.out.println(Arrays.compare(a1, b1));

		int a2[] = { 2, 4, 6, 8, 1, 3, 5, 7 };
		int b2[] = { 2, 4, 6, 8, 1, 3, 5 };
		System.out.println(Arrays.compare(a2, b2));

		int a3[] = { 2, 4, 6, 8, 1, 3, 5 };
		int b3[] = { 2, 4, 6, 8, 1, 3, 5, 7 };
		System.out.println(Arrays.compare(a3, b3));

		Integer c[] = { 2, 4, 6, 8, 1, 3, 5, 7 };
		Arrays.sort(c, new My());
		for (Integer x : c)
			System.out.println(x);
	}
}
