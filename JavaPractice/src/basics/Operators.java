package basics;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of a,b and c");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		// Arithmetic operators
		System.out.println("add = " + (a + b));
		System.out.println("sub = " + (a - b));
		System.out.println("mul = " + (a * b));
		System.out.println("div = " + (a / b));
		System.out.println("mod = " + (a % b));

		// Relational operators
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a >= b);
		System.out.println(a <= b);

		// Logical operators

		System.out.println((a > b) && (a > c));
		System.out.println((a > b) || (a > c));
		System.out.println(!(a == b));
		System.out.println(!(a > b));

		// Ternary operator
		String result;
		result = (a % b == 0) ? "Divisible" : "Not divisible";
		System.out.println(result);
	}

}
