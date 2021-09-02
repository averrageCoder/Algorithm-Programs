package com.bridgelabz.algorithmprograms;

public class PalindromeAndAnagram {
	public static void main(String[] args) {
		prime(1000);

	}

	public static void prime(int last) {
		int i;
		for (i = 2; i <= last; i++) {
			int flag = 1;
			for (int j = 2; j <= (i / 2); j++) {
				if (i % j == 0) {
					flag = 0;
					break;
				}
			}
			if (flag == 1) {
				checkIfPalindrom(i);
			}
		}
	}

	public static void checkIfPalindrom(int n) {
		int remainder, reversedint = 0, originalint;
		originalint = n;
		while (n != 0) {
			remainder = n % 10;
			reversedint = reversedint * 10 + remainder;
			n = n / 10;
		}
		if (originalint == reversedint) {
			System.out.print(originalint + " ");
		}
	}
}