package com.listdemo;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<Integer> al1 = new LinkedList<>();
		LinkedList<Integer> al2 = new LinkedList<>(List.of(50, 60, 70, 80));
		al1.add(10);
		al1.add(0, 5);
		al1.addAll(2, al2);

		System.out.println(al1);

		al1.addFirst(3);
		al1.addLast(90);
		System.out.println(al1);

		al1.removeFirst();
		al1.removeLast();
		System.out.println(al1);

	}

}
