package com.arrays;

import java.util.ArrayList;

public class UnionTwoSorted {

	public static ArrayList<Integer> union(int[] a, int[] b){
	
		ArrayList<Integer> al = new ArrayList<>();
		
		int n1 = a.length;
		int n2 = b.length;
		
		int i = 0;
		int j = 0;
		
		while(i < n1 && j < n2) {
			
			//here you have understand 3 conditions
			//1) a[i] <= b[j] make i++
			//2) b[j] <= a[i] make j++
			//3) where a[j] == b[j] make i++; j++;
			
			if(a[i] <= b[j]) {
				
				if(al.size() == 0 || al.get(al.size()-1) != a[i]) {
					
					al.add(a[i]);
				}
				i++;
			}
			else if(a[i] >= b[j]) {
				
				if(al.size() == 0 || al.get(al.size()-1) != b[j]) {
					
					al.add(b[j]);
				}
				j++;
			}
			else {
				
				if(al.size() == 0 || al.get(al.size()-1) != a[i]) {
					
					al.add(a[i]);
				}
				i++;
				j++;
			}
		}
		
		while(i < n1) {
			
			if(al.size() == 0 || al.get(al.size()-1) != a[i]) {
				
				al.add(a[i]);
				
			}
			i++;
		}
		
		while(j < n2) {
			
			if(al.size() == 0 || al.get(al.size()-1) != b[j]) {
				
				al.add(b[j]);
			}
			j++;
		}
		return al;
	}
	
	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5};
		int[] b = {2,3,4,4,5,6};
		
		ArrayList<Integer> union = union(a, b);
		
		System.out.println(union);

	}

}
