package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

//binary search of given words
public class BinarySearch {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String[] words = {"today","is","a","wonderful","day"};
		int n = words.length;

		String temp;
		System.out.println("Strings in sorted order:");
		for (int j = 0; j < words.length; j++) {
	   	   for (int i = j + 1; i < words.length; i++) {
			if (words[i].compareTo(words[j]) < 0) {
				temp = words[j];
				words[j] = words[i];
				words[i] = temp;
			}
		   }
		}
		for (int m = 0; m < words.length; m++) {
			System.out.print(words[m] + " ");
		}

		System.out.println("\nEnter the word you want to search for: ");
		String word = scn.next();
		int li = 0, hi = n - 1, mi = 0;
		boolean flag=false;

		while (li <= hi) {
			mi = (li + hi) / 2;
			if (words[mi].equals(word)) {
				flag=true;
				break;
			} else if ((words[mi].compareTo(word)) < 0) {
				li = mi + 1;
			} else {
				hi = mi-1;
			}
		}
		if (flag) System.out.println("\""+word + "\" is word no. " + (mi + 1));
		else System.out.println("Not found!");
	}
}