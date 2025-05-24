package com.arrays;

public class SecondLargest {
	
	public static int secondLargest(int[] arr) {
		
		int largest = arr[0];
		int slargest = -1;
		
		for(int i = 1; i<arr.length; i++) {
			
			if(arr[i] > largest) {
				
				slargest = largest;
				largest = arr[i];
			}
			
			else if(arr[i] > slargest && arr[i] < largest) {
				
				slargest = arr[i];
			}
		}
		return slargest;
	}

	public static void main(String[] args) {
		
		int[] arr = {2,8,3,7,1,5,8,5,7};
		
		int secondLargest = secondLargest(arr);
		
		System.out.println("The Second Largest Element from array is : "+secondLargest);
	}

}
