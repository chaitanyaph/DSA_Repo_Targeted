package com.arrays;

import java.util.ArrayList;

public class ArrayLeaders {

	public static ArrayList arrayLeaders(int[] arr) {
		
		int maxi = Integer.MIN_VALUE;
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i = arr.length-1; i>=0; i--) {
			
			if(arr[i] > maxi) {
				
				al.add(arr[i]);
			}
			
			maxi = Math.max(maxi, arr[i]);
		}
		
		return al;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {10, 22, 12, 3, 0, 6};
		
		ArrayList arrayLeaders = arrayLeaders(arr);
		
		System.out.println(arrayLeaders);

	}

}
