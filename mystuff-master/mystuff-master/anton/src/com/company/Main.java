package com.company;

public class Main {

    public static void main(String[] args) {
        AntonBubbleSort myBS = new AntonBubbleSort();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        myBS.bubbleSort(arr);
        System.out.println("Sorted array");
        myBS.printArray(arr);
    }
}
