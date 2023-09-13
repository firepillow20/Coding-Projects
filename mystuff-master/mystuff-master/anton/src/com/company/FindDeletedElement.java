package com.company;

public class FindDeletedElement {
    void FindDel(int arr[],double avg){
        int n = arr.length;
        double sum = avg * (n + 1);
        for (int i = 0;i < n;i++){
            sum -= arr[i];
        }
        System.out.println("The missing element is " + sum);
    }

    public static void main(String args[]) {
        int arr[] =  {1, 3, 4, 6, 9, 9, 10, 15};
        double avg = 7;
        FindDeletedElement FDE = new FindDeletedElement();
        FDE.FindDel(arr, avg);
        //System.out.println("Length of the longest consecutive subsequence is " + findLongestSeq(arr));
    }
}
