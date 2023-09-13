package com.company;

public class Pow2BitTest {
    static int countSetBits(int n)
    {
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }

    public static int countSetBits2(int n)
    {
        int count = 0;
        while (n != 0) {
            count++;
            n &=(n-1);
        }
        return count;
    }

    static boolean isPowerOfTwo (int x)
    {
        return x!=0 && ((x&(x-1)) == 0);

    }
    public static void main(String args[]) {
        int n = 7; //1073741825;
        System.out.println(countSetBits(n));
        System.out.println(countSetBits2(n));
        if (countSetBits(n)==1){
            System.out.println("The number is a power of 2");
        }
        else System.out.println("The number is NOT a power of 2");
        if (isPowerOfTwo(n)){
            System.out.println("The number is a power of 2");
        }
        else System.out.println("The number is NOT a power of 2");
    }
}
