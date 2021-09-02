package com.bridgelabz.algorithmprograms;

import java.util.Arrays;
import java.util.Scanner;

//binary search of given words
public class BinarySearch {
	
	public static <E extends Comparable<E>> void binarySearch(E[] inputArray, E key) {
		int n = inputArray.length;
		int li = 0, hi = n - 1, mi = 0;
		boolean flag=false;

		while (li <= hi) {
			mi = (li + hi) / 2;
			if (inputArray[mi].equals(key)) {
				flag=true;
				break;
			} else if ((inputArray[mi].compareTo(key)) < 0) {
				li = mi + 1;
			} else {
				hi = mi-1;
			}
		}
		if (flag) System.out.println("\""+key + "\" is at position no. " + (mi + 1));
		else System.out.println("Not found!");
	}
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		//String[] inputArray = {"today","is","a","wonderful","day"};
		Integer inputArray[] = { 1,5,-1,45,-10};
		System.out.println("Input Array in sorted order:");
		Arrays.sort(inputArray);
		
		for (int m = 0; m < inputArray.length; m++) {
			System.out.print(inputArray[m] + " ");
		}

		System.out.println("\nEnter the key you want to search for: ");
		//String key = scn.next();
		Integer key = scn.nextInt();
		
		binarySearch(inputArray, key);
		
	}
}