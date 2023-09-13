package com.company;
import java.util.Scanner; // import the Scanner class

public class MyScanner {

    static class MyClass {
        public static void main(String[] args) {
            Scanner myObj = new Scanner(System.in);
            Boolean userName;

            // Enter username and press Enter
            System.out.println("Enter username: ");
            userName = myObj.nextBoolean();

            System.out.println("Username is: " + userName);
        }
    }

}
