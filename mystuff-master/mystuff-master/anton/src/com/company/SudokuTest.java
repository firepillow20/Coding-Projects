package com.company;

public class SudokuTest {
        static void isSudoku(int[][] a, int n){
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int compEl = a[i][j];
                    for (int p = j + 1; p < n; p++) {
                        if (a[i][p] == compEl) {
                            System.out.println("The square is not a sudoku.");
                            return;
                        }
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int compEl = a[i][j];
                    for (int p = i + 1; p < n; p++) {
                        if (a[p][j] == compEl) {
                            System.out.println("The square is not a sudoku.");
                            return;
                        }
                    }
                }
            }
            System.out.println("The square is a sudoku.");
            return;
        }
        public static void main(String[] args)
        {
            int a[][] = { { 2, 5, 6 },
                    { 9, 10, 3 },
                    { 12, 11, 7 } };
            int n = 3;
            isSudoku(a, n);
        }
    }
