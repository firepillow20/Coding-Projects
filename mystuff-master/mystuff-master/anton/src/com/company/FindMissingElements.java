package com.company;

import java.util.HashSet;
import java.util.Iterator;

public class FindMissingElements {
    void missingArr (int arr[]) {
        HashSet<Integer> mySet = new HashSet<Integer>();
        for (int i=0;i<arr.length;i++){
            mySet.add(arr[i]);
        }
        for (int i=1;i<arr[arr.length-1];i++){
            if (!mySet.contains(i)) {
                System.out.print(i + ", ");
            }
        }
        System.out.println();

       /* Iterator<Integer> i = mySet.iterator();
        while (i.hasNext()) {
            System.out.print(i.next()+" ");
        }
        return; */

    }

    public static void main(String args[]) {
        int arr[] =  {1, 3, 3, 3, 4, 9, 9, 10, 15};
        FindMissingElements FME = new FindMissingElements();
        FME.missingArr(arr);
        //System.out.println("Length of the longest consecutive subsequence is " + findLongestSeq(arr));
    }
}
