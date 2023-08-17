package basics;

import java.util.Scanner;

public class SwappingNumsXOR {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of a and b");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Before swapping");
		System.out.println("Value of a is " + a);
		System.out.println("Value of b is " + b);
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("After swapping");
		System.out.println("Value of a is " + a);
		System.out.println("Value of b is " + b);
	}
}
