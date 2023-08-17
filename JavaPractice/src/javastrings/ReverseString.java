package javastrings;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		String reversedStr = "";
		int n = str.length();
		for (int i = n - 1; i >= 0; i--) {
			reversedStr = reversedStr + str.charAt(i);
		}
		System.out.println("original string is " + str);
		System.out.println("Reverse of a string is " + reversedStr);

	}

}
