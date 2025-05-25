package com.arrays;

import java.util.Arrays;

public class MergeTwoSorted {

	public static void mergeTwoSorted(int[] arr, int[] brr) {
		
		int i = arr.length-1;
		int j = 0;
		
		while(i >= 0 && j < brr.length) {
			
			if(arr[i] > brr[j]) {
				
				//swapping logic
				int temp = arr[i];
				arr[i] = brr[j];
				brr[j] = temp;
			}
			
			i--;
			j++;
		}
		
		Arrays.sort(arr);
		Arrays.sort(brr);
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1, 3, 5, 7};
		int[] brr = {2, 4, 6, 8, 10};
		
		
		mergeTwoSorted(arr, brr);
		
		for(int i = 0; i<arr.length; i++) {
			
			System.out.print(arr[i]+"\t");
		}
		for(int i = 0; i<brr.length; i++) {
			
			System.out.print(brr[i]+"\t");
		}

	}

}
