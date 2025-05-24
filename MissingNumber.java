package com.arrays;

public class MissingNumber {

	public static int missingNumber(int[] arr) {
		
		int sum1 = 0;
		int sum2 = 0;
		
		for(int i = 0; i<arr.length; i++) {
			
			sum1 += arr[i];
		}
		
		for(int i = 1; i<=arr.length; i++) {
			
			sum2 += i;
		}
		
		return sum2 - sum1;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {0,1,2,3,4,6,7,8};
		
		int missingNumber = missingNumber(arr);
		
		System.out.println("Missing Number is : "+missingNumber);
	}

}
