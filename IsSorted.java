package com.arrays;

public class IsSorted {

	public static boolean checkSorted(int[] arr) {
		
		for(int i = 1; i < arr.length; i++) {
			
			if(arr[i] >= arr[i-1]) {
				
			}
			else {
				
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1,29,3,4,5,6};
		
		boolean checkSorted = checkSorted(arr);
		
		if(checkSorted) {
			
			System.out.println("Array is Sorted.....");
		}
		else {
			
			System.out.println("Array is unsorted......");
		}
	}

}
