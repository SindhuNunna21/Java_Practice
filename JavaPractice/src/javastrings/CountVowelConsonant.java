package javastrings;

import java.util.Scanner;

public class CountVowelConsonant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		int vCount = 0, cCount = 0;
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vCount++;
			} else if (ch >= 'a' && ch <= 'z') {
				cCount++;
			}
		}
		System.out.println("Number of Vowels: " + vCount);
		System.out.println("Number of Consonants: " + cCount);
	}

}
