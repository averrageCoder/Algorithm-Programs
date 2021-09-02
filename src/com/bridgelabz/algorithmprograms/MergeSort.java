package com.bridgelabz.algorithmprograms;

import java.util.Arrays;

class MergeSort
{

	@SafeVarargs
    static <E> E[] newArray(int length, E... array)
    {
        return Arrays.copyOf(array, length);
    }
	
    static <E extends Comparable<E>> void merge(E arr[], int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;
 
        E[] L;
        E[] R;
        
        L = newArray(n1);
        R = newArray(n2);
 
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
 
 
        int i = 0, j = 0;
 
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i].compareTo(R[j]) <= 0) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
 
    static <E extends Comparable<E>> void sort (E arr[], int l, int r) {
        if (l < r) {
            int m =l+ (r-l)/2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }
  
    public static void main(String args[])
    {
//    	String[] inputArray = {"Emma","Dave","Cindy","Bom","Andy","Bob"};
    	Integer[] inputArray = { 1,5,-1,45,-10};
 
        System.out.println("Before merge sort: "+ Arrays.toString(inputArray));

        sort(inputArray, 0, inputArray.length - 1);
 
        System.out.println("After merge sort: "+ Arrays.toString(inputArray));
    }
}