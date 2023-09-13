package com.company;
import java.util.*;

public class FindLongestConseqSeq {
    int findLongestSeq (int arr[]) {
        int n = arr.length;
        HashSet<Integer> S = new HashSet<Integer>();
        for (int i=0; i<n; ++i) {
            S.add(arr[i]);
        }
        int result = 0;
        for (int i=0; i<n; ++i) {
            if (!S.contains(arr[i]-1)) {
                int j = arr[i];
                while (S.contains(j))
                    j++;
                if (result < j-arr[i])
                    result = j-arr[i];
            }
        }
        return result;
    }
    public static void main(String args[]) {
        int arr[] =  {1, 9, 3, 10, 4, 20, 2, 5};
        FindLongestConseqSeq FSQ = new FindLongestConseqSeq();
        System.out.println("Length of the longest consecutive subsequence is " + FSQ.findLongestSeq(arr));
        //System.out.println("Length of the longest consecutive subsequence is " + findLongestSeq(arr));
    }
}
