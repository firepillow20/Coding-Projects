package com.company;

public class MinHalls {
    static int MAX = 24;

    static int minHalls(int lecs [][], int n){
        int [] prefix_sum = new int[MAX];

        // For every lecture increment start
        // point s decrement (end point + 1)
        for (int i = 0; i < n; i++)
        {
            prefix_sum[lecs[i][0]]++;
            prefix_sum[lecs[i][1] + 1]--;

        }

        int ans = prefix_sum[0];

        // Perform prefix sum and update
        // the ans to maximum
        for (int i = 1; i < MAX; i++)
        {
            prefix_sum[i] += prefix_sum[i - 1];
            ans = Math.max(ans, prefix_sum[i]);
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int lectures[][] = {{ 0, 5 },
                { 1, 2 },
                { 1, 10 }};
        int n = lectures.length;

        System.out.println(minHalls(lectures, n));
    }
}
