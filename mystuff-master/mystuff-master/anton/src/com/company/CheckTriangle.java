package com.company;


public class CheckTriangle {
    static void checkTriangleType(int a, int b, int c) {
        if (a + b > c && b + c > a && a + c > b) {
            int sqa = (int) Math.pow(a, 2);
            int sqb = (int) Math.pow(b, 2);
            int sqc = (int) Math.pow(c, 2);
            if (sqa + sqb == sqc || sqa + sqc == sqb || sqb + sqc == sqa) {
                System.out.println("This is a right triangle.");
            } else if (sqa + sqb < sqc || sqa + sqc < sqb || sqb + sqc < sqa) {
                System.out.println("This is an obtuse triangle.");
            } else {
                System.out.print("This is an acute triangle.");
            }
        }
        else System.out.print("This is not a valid triangle.");
    }
    public static void main(String[] args){
        int A = 6;
        int B = 3;
        int C = 4;
        checkTriangleType(A,B,C);
    }
}
