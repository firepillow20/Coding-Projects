package com.company;

public class Pow2Test {
    static boolean isPowerOf2 (Double n){
        while (n > 2){
            n = n / 2;
        }
        if (n == 2){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]) {
        Double n = new Double(1073741824);
        Integer m = new Integer(1073741824);
        System.out.println(m.toBinaryString(m));
        if (isPowerOf2(n)){
            System.out.println("The number is a power of 2");
        }
        else{
            System.out.println("The number is not a power of 2");
        }


    }
}
