package basics;

import java.util.Scanner;

public class NumsBtw2Nums {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of a and b");
		int a = sc.nextInt();
		int b = sc.nextInt();
		for (int i = a + 1; i < b; i++) {
			if (i % 4 == 0) {
				i++;
			}
			System.out.print(i + " ");
		}
	}
}
