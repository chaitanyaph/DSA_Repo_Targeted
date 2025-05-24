package com.arrays;

public class MajorityElement {

	public static int majorityElement2(int[] arr) {
		
		int element = 0;
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			if(count == 0) {
				
				element = arr[i];
				count = 1;
			}
			else if (element ==  arr[i]) {
				
				count++;
			}
			else {
				
				count--;
			}
		}
		
		count = 0;
		
		for(int i =  0; i<arr.length; i++) {
			
			if(element == arr[i]) {
				
				count++;
			}
		}
		
		if(count > arr.length / 2) {
			
			return element;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {2, 1, 1,1, 1, 2, 1, 2};
		
		int majorityElement2 = majorityElement2(arr);
		
		System.out.println(majorityElement2);

	}

}
