package com.company;

public class LongestPalindrome {

        public static String tempPalindrome(String s, int left, int right){
            if(left > right) return null;
            while (left >=0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                left--;
                right++;

            }
            return s.substring(left+1, right);
        }
        public static String longestPalindromeString(String s){
            if(s.length() == 0) return null;
            String longest = s.substring(0, 1);
            for(int i = 0; i < s.length()-1; i++){
                String palindrome = tempPalindrome(s,i,i);
                if(palindrome.length()> longest.length()){
                    longest = palindrome;
                }
                palindrome = tempPalindrome(s,i,i+1);
                if(palindrome.length() > longest.length()){
                    longest = palindrome;
                }
            }
            return longest;
        }

        public static void main(String[] args) {
            System.out.println(longestPalindromeString("1234"));
            System.out.println(longestPalindromeString("12321"));
            System.out.println(longestPalindromeString("9912321456"));
            System.out.println(longestPalindromeString("9912333321456"));
            System.out.println(longestPalindromeString("12145445499"));
            System.out.println(longestPalindromeString("1223213"));
            System.out.println(longestPalindromeString("ballacar"));
            System.out.println(longestPalindromeString("ratsliveonnoevilstar"));
        }

    }
