package com.arrays;

public class Maxconsi1 {

	public static int maxConsecutive(int[] arr) {
		
		int maxi = 0;
		int count = 0;
		
		for(int i = 0; i<arr.length; i++) {
			
			if(arr[i] == 1) {
				
				count++;
				maxi = Math.max(maxi, count);
			}
			
			else {
				
				count = 0;
			}
		}
		return maxi;
	}
	
	public static void main(String[] args) {
		
		int[] arr =  {1,2,1,1,3,5,1,1,1,3,4,1,1,1,1,9};
		
		int maxConsecutive = maxConsecutive(arr);
		
		System.out.println(maxConsecutive);

	}

}
