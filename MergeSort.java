package com.sorting;

public class MergeSort {

	public static void merge(int[] arr, int low, int mid, int high) {
		
		int left = low;
		int right = mid+1;
        int[] temp = new int[high - low + 1];
		int index = 0;
		
		while(left <= mid && right <= high) {
			
			if(arr[left] <= arr[right]) {
				
				temp[index++] = arr[left++];
			}
			else {
				
				temp[index++] = arr[right++];
			}
		}
		
		while(left <= mid) {
			
			temp[index++] = arr[left++];
		}
		
		while(right <= high) {
			
			temp[index++] = arr[right++];
		}
		
		
		//copying the value
		for (int i = 0; i < temp.length; i++) {
            arr[low + i] = temp[i];
        }
	}
	
	public static void mergeSort(int[] arr, int low, int high) {
		
		if(low >= high) return ;
		
		int mid = (low + high) / 2;
		
		mergeSort(arr, low, mid);
		mergeSort(arr, mid+1, high);
		merge(arr, low, mid, high);
	}
	
	public static void main(String[] args) {
		
		int[] arr = {10,9,8,7,6,5,4,3,2,1};
		
		mergeSort(arr, 0, arr.length-1);
		
		//after sorting the array
		
		for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
	}

}
