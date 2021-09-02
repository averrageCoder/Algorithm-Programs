package com.bridgelabz.algorithmprograms;

public class PrimeNumbers {
	public static void main(String[] args) {
		
		int start = 0, end = 1000;
		for (int i = 2; i <= end; i++) {
			int flag = 1;
			for (int j = 2; j <= (i / 2); j++) {
				if (i % j == 0) {
					flag = 0;
					break;
				}
			}
			if (flag == 1)
				System.out.print(i + " ");
		}
	}

}