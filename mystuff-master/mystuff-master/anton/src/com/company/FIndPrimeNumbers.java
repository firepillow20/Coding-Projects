package com.company;

public class FIndPrimeNumbers {
    public static void main(String args[]) {
        int n = 50;
        boolean prime[] = new boolean[n+1];
        for (int i = 0; i <= n; i++) {
            prime[i] = true;
        }
        for (int j = 2; j * j <= n; j++) {
            if (prime[j] == true){
                for (int i = j * j; i <= n; i++){
                    if (i % j == 0){
                        prime[i] = false;
                    }
                }
            }
        }
        for (int i = 2; i <= n; i++){
            if (prime[i]){
                System.out.println(i);
            }
        }
    }
}
