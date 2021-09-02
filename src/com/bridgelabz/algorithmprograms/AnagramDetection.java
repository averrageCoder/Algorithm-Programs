package com.bridgelabz.algorithmprograms;

import java.util.Arrays;

public class AnagramDetection {

	public static void main(String[] args) {
		
		String firstWord = "heart";
		String lastWord = "earth";
		int firstWordLength = firstWord.length();
		int lastWordlength = lastWord.length();

		if (firstWordLength == lastWordlength) {
			char[] firstWordCharArray = firstWord.toCharArray();
			Arrays.sort(firstWordCharArray);

			char[] lastWordCharArray = lastWord.toCharArray();
			Arrays.sort(lastWordCharArray);

			if (Arrays.equals(firstWordCharArray, lastWordCharArray)) {
				System.out.println("The two strings are anagram.");
			} else {
				System.out.println("The two strings are not anagram.");
			}
		} else {
			System.out.println("The two strings are not of same length.");
		}
	}

}