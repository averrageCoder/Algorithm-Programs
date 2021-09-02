package com.bridgelabz.algorithmprograms;

import java.util.Arrays;

public class InsertionSort {
	
	public static <E extends Comparable<E>> E[] insertionSort(E[] inputArray) {
		E key;
		int i,j;
		for (j = 1; j < inputArray.length; j++) {
		    key = inputArray[j];
		    i = j - 1;
		    while (i >= 0) {
		      if (key.compareTo(inputArray[i]) > 0) {
		        break;
		      }
		      inputArray[i + 1] = inputArray[i];
		      i--;
		    }
		    inputArray[i + 1] = key;
		  }
		return inputArray;
	}

	public static void main(String[] args) {
		  //String[] inputArray = {"Emma","Dave","Cindy","Bom","Andy","Bob"};
		Integer inputArray[] = { 1,5,-1,45,-10};
		  System.out.println("Before insertion sort: "+ Arrays.toString(inputArray));
		  inputArray = insertionSort(inputArray);
		  System.out.println("After insertion sort: "+Arrays.toString(inputArray));
		}
	
}
