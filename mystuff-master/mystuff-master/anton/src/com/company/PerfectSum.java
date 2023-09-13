package com.company;

public class PerfectSum {
    public static void sumSubsets(int[] set, int n, int target){
        // Create the new array with size
        // equal to array set[] to create
        // binary array as per n(decimal number)
        int x[] = new int[set.length];
        int j = set.length - 1;

        // Convert the array into binary array
        while (n > 0) {
            x[j] = n % 2;
            n = n / 2;
            j--;
        }

        int sum = 0;

        // Calculate the sum of this subset
        for (int i = 0; i < set.length; i++)
            if (x[i] == 1)
                sum = sum + set[i];

        // Check whether sum is equal to target
        // if it is equal, then print the subset
        if (sum == target) {
            System.out.print("{");
            for (int i = 0; i < set.length; i++)
                if (x[i] == 1)
                    System.out.print(set[i] + ", ");
            System.out.print("}, ");
        }
    }
    public static void findSubsets(int[] arr, int k){
    int x = (int)Math.pow(2, arr.length);
        for (int i = 1; i < x; i++)
            sumSubsets(arr, i, k);
    }
    public static void main(String args[])
    {
        int arr[] = { 5, 10, 12, 13, 15, 18 };
        int K = 30;

        findSubsets(arr, K);
    }
}
