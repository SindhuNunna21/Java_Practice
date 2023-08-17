package com.tokenizer;

import java.util.StringTokenizer;

public class TokenizerDemo {

	public static void main(String[] args) {
		String data = "name=Vijay;address=Delhi;country=India;dept=cse";
		StringTokenizer stk = new StringTokenizer(data, "=;");// Delimiter
		String s;
		while (stk.hasMoreTokens()) {
			s = stk.nextToken();
			System.out.println(s);
		}

	}

}
