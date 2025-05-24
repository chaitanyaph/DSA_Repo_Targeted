package com.arrays;

import java.util.HashMap;

public class TwoSum {

	public static int[] twoSum(int[] arr, int target) {
		
		HashMap<Integer, Integer> mapp = new HashMap<>();
		
		for(int i = 0; i<arr.length; i++) {
			
			int complement = target - arr[i];
			
			if(mapp.containsKey(complement)) {
				
				return new int[] {i, mapp.get(complement)};
			}
			
			mapp.put(arr[i], i);
		}
		
		return new int[] {-1, -1};
	}
	
	public static void main(String[] args) {
		
		int[] arr  = {2,6,5,8,11};
		
		int[] twoSum = twoSum(arr, 14);
		
		for(int i = 0; i<twoSum.length; i++) {
			
			System.out.print(twoSum[i]+"\t");
		}
	}

}
