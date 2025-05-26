package com.arrays;

import java.util.ArrayList;

public class FindMissAndRepeat {

    public static ArrayList<Integer> findMissingAndRepeating(int[] arr) {
        int n = arr.length;

      
        int[] hash = new int[n + 1];

        
        for (int i = 0; i < arr.length; i++) {
            
        	hash[arr[i]]++;  
        }

        int missing = -1;
        int repeating = -1;

        for (int i = 1; i <= n; i++) {
            if (hash[i] == 0) {
                missing = i;
            } else if (hash[i] == 2) {
                repeating = i;
            }
        }

        ArrayList<Integer> al = new ArrayList<>();
        al.add(missing);
        al.add(repeating);
        return al;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 6, 2, 1, 1};  // n = 6, 1 is repeating, 5 is missing
        ArrayList<Integer> result = findMissingAndRepeating(arr);
        System.out.println("Missing Number: " + result.get(0));
        System.out.println("Repeating Number: " + result.get(1));
    }
}
