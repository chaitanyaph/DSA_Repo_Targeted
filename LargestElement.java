package com.arrays;

public class LargestElement {
	
	public static int findLargest(int[] arr) {
		
		int largest = arr[0];
		
		for(int i = 1; i<arr.length; i++) {
			
			if(arr[i] > largest) {
				
				largest = arr[i];
			}
		}
		return largest;
	}

	public static void main(String[] args) {
		
		int[] arr = {7,1,4,3,6,9,3,10};
		
		int findLargest = findLargest(arr);
		
		System.out.println("The Largest Element from the given array is  : "+ findLargest);
	}

}
