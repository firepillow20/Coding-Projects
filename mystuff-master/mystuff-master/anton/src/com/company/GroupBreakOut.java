package com.company;
import java.io.*;
import java.util.Scanner;

public class GroupBreakOut {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File ("/Users/aivanova/IdeaProjects/anton/test123.txt"));
        while(input.hasNext()) {
            String answer = input.nextLine();
            System.out.println(answer);
        }
        String fileName = "temp.txt";

    }
}
