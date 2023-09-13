package com.company;

public class FindMountain {
    static void countMountains(int[][] a, int n){
        int[][] A = new int[n + 2][n + 2];
        for (int i = 0; i < n + 2; i++){
            for (int j = 0; j < n + 2; j++){
                if(i == 0 || j == 0 || i == n + 1 || j == n + 1){
                    A[i][j] = 0;
                }
                else {
                    A[i][j] = a[i - 1][j - 1];
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                    if ((A[i][j] > A[i - 1][j])
                            && (A[i][j] > A[i + 1][j])
                            && (A[i][j] > A[i][j - 1])
                            && (A[i][j] > A[i][j + 1])
                            && (A[i][j] > A[i - 1][j - 1])
                            && (A[i][j] > A[i + 1][j + 1])
                            && (A[i][j] > A[i - 1][j + 1])
                            && (A[i][j] > A[i + 1][j - 1])){
                        System.out.println("Mountain found: "+ A[i][j]);
                }
                // System.out.println(A[i][j]);
            }
        }
    }
    public static void main(String[] args)
    {
        int a[][] = { { 4, 5, 6 },
                { 2, 1, 3 },
                { 7, 8, 9 } };
        int n = 3;
        countMountains(a, n);
    }
}
