package basics;

import java.util.Scanner;

public class SwapNums {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of first and second");
		int first = sc.nextInt();
		int second = sc.nextInt();

		// With temp variable

		System.out.println("Before swapping");
		System.out.println("First number is " + first);
		System.out.println("Second number is " + second);
		int temp = first;
		first = second;
		second = temp;
		System.out.println("After swapping");
		System.out.println("First number is " + first);
		System.out.println("Second number is " + second);

		// Without temp variable

		System.out.println("--Before swapping--");
		System.out.println("First number is " + first);
		System.out.println("Second number is " + second);
		first = first + second;
		second = first - second;
		first = first - second;
		System.out.println("--After swapping--");
		System.out.println("First number is " + first);
		System.out.println("Second number is " + second);

	}

}
