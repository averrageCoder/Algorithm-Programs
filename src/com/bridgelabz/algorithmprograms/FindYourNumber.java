package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

public class FindYourNumber {
	
	static Scanner scan = new Scanner(System.in);
	static int MAX_QUESTIONS;
	
	public static void main(String args[]) {
		
		int n = 10;
		MAX_QUESTIONS = n;
		
		System.out.println("Lets help you find your number between 0 & "+(int)Math.pow(2, n)+" in less than "+n+" questions!");
		
		binarySearch(0, (int)Math.pow(2, n));
		
	}
	
	public static void binarySearch(int low, int high) {
		
		System.out.format("%nQuestions Left: %d%n", MAX_QUESTIONS);
		MAX_QUESTIONS--;
		
		int choice, mid=(low+high)/2;
		if(low==high) System.out.println("Your number is: "+mid);

		System.out.format("%nEnter %n1: True (between %d & %d) %n2: False (between %d & %d) %n0: Match Found = %d %n",low,mid-1,mid+1,high,mid);
		choice = scan.nextInt();
		if(choice==1) {
			binarySearch(low,mid);
		}
		else if(choice==2) {
			binarySearch(mid,high);
		}
		else {
			System.out.println("Your number is: "+mid);
		}
			
	}
	
}
