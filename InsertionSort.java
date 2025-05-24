package com.sorting;

public class InsertionSort {

	public static void insertionSort(int[] arr) {
		
		for(int i = 0; i<arr.length; i++) {
			
			int j = i;
			
			while(j > 0 && arr[j-1] >= arr[j]) {
				
				//swapping logic
				int temp = arr[j-1];
				arr[j-1] = arr[j];
				arr[j] = temp;
				
				j--;
			}
		}
	}
	
	public static void main(String[] args) {
		
		int[] arr = {10,9,8,7,6,5,4,3,2,1};
		
		insertionSort(arr);
		
		for(int i = 0; i<arr.length; i++) {
			
			System.out.print(arr[i]+" ");
		}

	}

}
