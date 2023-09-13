package com.company;

public class BinarySearch {
    int binarySearch(int arr[], int l, int u, int x) {
        if (u - l >= 1)
        {
            int mid = (u + l) / 2;
            System.out.println(mid);
            System.out.println(arr[mid]);
            if (arr[mid] == x)
            {
                return mid;
            }
            if (arr[mid] > x)
            {
                return binarySearch(arr, l, mid - 1, x);
            }
            if (arr[mid] < x)
            {
                return binarySearch(arr, mid + 1, u, x);
            }
        }
        return -1;
    }
    public static void main(String args[]){
        BinarySearch ab = new BinarySearch();
        int arr[] = { 1, 3, 6, 8, 11, 17, 21, 70, 560, 890, 1178 };
        int x = 1178;
        int result = ab.binarySearch(arr, 0, arr.length, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }
}
