package com.company;
import java.util.*;

public class CountPairs {
    void countPairs (int[] arr){
        HashMap<Integer, Integer> myMap = new HashMap<>();
        int n = arr.length;
        for (int i=0; i<n; i++){
            myMap.put(arr[i]-i,0);
        }
        for (int i=0; i<n; i++){
            myMap.put(arr[i]-i,myMap.get(arr[i]-i)+1);
        }
        int result = 0;
        for (int x : myMap.values())
        {
            int count = x;
            result += ((count * (count - 1)) / 2);
        }
        System.out.println(result);

    }
    public static void main(String args[]) {
        int arr[] =  {1, 3, 4, 6, 9, 9, 10, 15, 16, 17, 18};
        CountPairs CP = new CountPairs();
        CP.countPairs(arr);
        //System.out.println("Length of the longest consecutive subsequence is " + findLongestSeq(arr));
    }
}
