package com.bridgelabz.algorithmprograms;

import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String []args) {
		Integer integer_array[] = { 1,5,-1,45,-10};
		Integer temp;
		System.out.println("Before bubble sort: "+ Arrays.toString(integer_array));
		for (int j = 0; j < integer_array.length; j++) {
	   	   for (int i = j + 1; i < integer_array.length; i++) {
			if (integer_array[i].compareTo(integer_array[j]) < 0) {
				temp = integer_array[j];
				integer_array[j] = integer_array[i];
				integer_array[i] = temp;
			}
		   }
		}
		System.out.println("After bubble sort: "+ Arrays.toString(integer_array));
	   }

}