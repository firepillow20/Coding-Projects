package com.company;

import java.util.HashMap;

public class FindMajority {
    static void findMaj (int arr[]) {
        HashMap<Integer,Integer> myMap = new HashMap<Integer, Integer>();
        for (int i=0;i<arr.length; i++){
            if (myMap.containsKey(arr[i])){
                int count = myMap.get(arr[i])+1;
                if (count>arr.length/2) {
                    System.out.println("Majority element found: " + arr[i]);
                    return;
                }
                else myMap.put(arr[i], count);
            }
            else myMap.put(arr[i],1);
        }
        System.out.println("No majority element found.");
    }
    public static void main(String[] args) {
        int a[] = new int[]{2,2,2,2,5,5,2,3,3,3,3};
        findMaj(a);
    }
}
