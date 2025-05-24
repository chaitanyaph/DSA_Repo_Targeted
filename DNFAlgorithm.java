package com.arrays;

public class DNFAlgorithm {

	public static void sortByDnf(int[] arr) {
		
		int low = 0;
		int mid = 0;
		int high = arr.length - 1;
		
		while(mid <= high) {
			
			if(arr[mid] == 0) {
				
				//swapping logic
				int temp = arr[low];
				arr[low] = arr[mid];
				arr[mid] = temp;
				
				low++;
				mid++;
			}
			
			else if(arr[mid] == 1) {
				
				mid++;
			}
			
			else {
				
				//swapping logic
				int temp = arr[high];
				arr[high] = arr[mid];
				arr[mid] = temp;
				
				high--;
			}
		}
	}
	
	public static void main(String[] args) {
		
		int[] arr = {2,1,0,0,1,2,0,1,2,1,0,2,1,0,1};
		
		sortByDnf(arr);
		
		//after sorting logic
		for(int i = 0; i<arr.length; i++) {
			
			System.out.print(arr[i]+" ");
		}
	}

}
