package com.arrays;

public class RoatateArrayBydPlaces {
	
	public static void rotating(int[] arr, int key) {
		
		key = key % arr.length;
		
		int[] temp = new int[key];
		
		for(int i = 0; i<key; i++) {
			
			temp[i] = arr[i];
		}
		
		for(int i = key; i < arr.length; i++) {
			
			arr[i-key] = arr[i];
		}
		
		int index = 0;
		for(int i = arr.length-key; i<arr.length; i++) {
			
			arr[i] = temp[index];
			index++;
		}
	}
	
	public static void reverseArray(int start, int end, int[] arr) {
		
		while(start < end) {
			
			//swapping logic
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] =  temp;
			
			start++;
			end--;
		}
	}
	
	public static void rotateByd(int[] arr, int key) {
		
		key = key % arr.length;
		
		reverseArray(0, key-1, arr);
		reverseArray(key, arr.length-1, arr);
		reverseArray(0, arr.length-1, arr);
	}

	public static void main(String[] args) {
		
		int[] arr =  {1,2,3,4,5,6,7,8};
		
		int d = 5;
		
		//rotateByd(arr, d);
		rotating(arr, d);
		
		for(int i = 0; i<arr.length; i++) {
			
			System.out.print(arr[i]+"\t");
		}

	}

}
