package com.sorting;

public class SelectionSort {

	public static void selectionSort(int[] arr) {
		
		for(int i = 0; i<arr.length-1; i++) {
			
			int minIndex =  i;
			
			for(int j = i; j<arr.length; j++) {
				
				if(arr[minIndex] > arr[j]) {
					
					minIndex = j;
				}
			}
			
			//swapping logic
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
	}
	
	public static void main(String[] args) {
		
		int[] arr = {10,9,8,7,6,5,4,3,2,1};
		
		selectionSort(arr);
		
		//after sorting
		
		for(int i = 0; i<arr.length; i++) {
			
			System.out.print(arr[i]+"\t");
		}
	}

}
