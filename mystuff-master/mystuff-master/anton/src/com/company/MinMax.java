package com.company;

public class MinMax {

    private static int maxValue (int n, int array[]) {
        int max = array[0];
        for(int x = 0;x < n; x++)
        {
            int array2 = array[x];
            if (array2 > max) {
                max = array2;
            }
        }
        return max;
    }
    private static int minValue (int n, int array[]) {
        int min = array[0];
        for(int x = 0;x < n; x++)
        {
            int array2 = array[x];
            if (array2 < min) {
                min = array2;
            }
        }
        return min;

    }
    private static double average (int n, int array[]) {
        int sum = 0;
        for(int x = 0;x < n; x++)
        {
            int num = array[x];
            sum = sum + num;
        }
        int average = sum / n;
        return average;
    }

    private static int maxkValue (int n, int k, int array[]) {
        int nextSum = 0;
        int max = 0;
        for(int x = 0;x < n - k + 1; x++)
        {
            nextSum = 0;
            for(int i = x;i < x + k; i++) {
                nextSum = nextSum + array[i];
            }
            if (nextSum > max) {
                max = nextSum;
            }
        }
        return max;
    }
    public static void main(String args[]){

        int a[] = {2,8,39,45,7,5,29,3,78,567,1000,35};
        int l = a.length;
        // 7,1,8
        System.out.println("Maximum:" + maxValue(l,a));
        System.out.println("Minimum:" + minValue(l,a));
        System.out.println("Average:" + average(l,a));
        System.out.println("K value:" + maxkValue(l,3,a));
    }

}
