package com.bridgelabz.algorithmprograms;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		  int i,j;
		  String key;
		  String[] inputArray = {"Emma","Dave","Cindy","Bom","Andy","Bob"};
		  System.out.println("Before insertion sort: "+ Arrays.toString(inputArray));
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
		  System.out.println("After insertion sort: "+Arrays.toString(inputArray));
		}
	
}
