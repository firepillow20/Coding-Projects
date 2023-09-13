package com.company;

public class AntonBubbleSort {

    void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j + 1])
                {
                        int num = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = num;
                }
            }
        }
    }

    void printArray(int arr[]) {
        int n = arr.length;
        for (int x = 0; x < n; x++) {
            System.out.print(arr[x] + ",");
        }

    }

    public static void main(String args[]) {
        AntonBubbleSort myBS = new AntonBubbleSort();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        myBS.bubbleSort(arr);
        System.out.println("Sorted array");
        myBS.printArray(arr);
    }
}
