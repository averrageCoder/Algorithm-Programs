package com.bridgelabz.algorithmprograms;

import java.util.Arrays;

public class BubbleSort {
	
	public static <E extends Comparable<E>> E[] bubbleSort(E[] inputArray) {
		E temp;
		for (int j = 0; j < inputArray.length; j++) {
		   	   for (int i = j + 1; i < inputArray.length; i++) {
				if (inputArray[i].compareTo(inputArray[j]) < 0) {
					temp = inputArray[j];
					inputArray[j] = inputArray[i];
					inputArray[i] = temp;
				}
			   }
			}
		return inputArray;
	}
	
	public static void main(String []args) {
		//Integer inputArray[] = { 1,5,-1,45,-10};
		String[] inputArray = {"Emma","Dave","Cindy","Bom","Andy","Bob"};
		System.out.println("Before bubble sort: "+ Arrays.toString(inputArray));
		inputArray = bubbleSort(inputArray);
		System.out.println("After bubble sort: "+ Arrays.toString(inputArray));
	   }

}