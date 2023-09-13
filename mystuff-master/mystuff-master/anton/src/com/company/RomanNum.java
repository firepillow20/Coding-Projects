package com.company;

import java.util.HashMap;

public class RomanNum {
    public static String toRoman (int n)
    {
        int[] anum = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String[] rnum = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        String ans = "";
        int myNum = n;
        for(int i = anum.length - 1; i >= 0; i--)
        {
            while(myNum >= anum[i])
            {
                ans = ans + rnum[i];
                myNum = myNum - anum[i];
            }
        }
        return ans;
    }
    public static int fromRoman (char[] rom)
    {
        HashMap<Character, Integer> myMap = new HashMap<Character, Integer>(){{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};
        int total = 0;
        for(int i = 0;i < rom.length;i++)
        {
            if(i == rom.length - 1){
                total = total + myMap.get(rom[i]);
            }
            else{
                if(myMap.get(rom[i]) < myMap.get(rom[i + 1]))
                {
                    total = total - myMap.get(rom[i]);
                }
                else total = total + myMap.get(rom[i]);
        }
        }
        return total;
    }
    public static void main(String args[])
    {
        int n = 3999;
        String rom = toRoman(n);
        System.out.println(rom);
        System.out.println(fromRoman(rom.toCharArray()));

    }
}
