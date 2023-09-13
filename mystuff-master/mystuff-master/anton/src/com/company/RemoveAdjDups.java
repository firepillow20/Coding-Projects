package com.company;

import java.util.*;

public class RemoveAdjDups
{
    static class KeyComparator implements Comparator<Key> {
        @Override
        public int compare(Key k1, Key k2)
        {
            if (k1.freq < k2.freq)
                return 1;
            else if (k1.freq > k2.freq)
                return -1;
            return 0;
        }
    }
    static class Key
    {
        int freq;
        char ch;
        Key(int f, char c)
        {
            freq = f;
            ch = c;
        }
    }
    static void RearrangeString(String s)
    {

        int MAX_CHAR = 26;
        int[] count = new int[MAX_CHAR];
        for (int i = 0; i < s.length(); i++)
        {
            count[s.charAt(i)-'a']++;
        }
        PriorityQueue<Key> pq = new PriorityQueue<>(new KeyComparator());
        for (char c = 'a'; c <= 'z'; c++) {
            int val = c - 'a';
            if (count[val] > 0)
                pq.add(new Key(count[val], c));
        }

        String str =  "";

        Key prev = new Key(-1, '#');

        while(pq.size() != 0)
        {
            Key k = pq.peek();
            pq.poll();
            str = str + k.ch;

            if (prev.freq > 0)
            {
                pq.add(prev);
            }

            k.freq--;
            prev = k;
        }
        System.out.println(str);
        if (s.length() != str.length())
            System.out.println("Not valid String");
        else
            System.out.println(str);
    }

    public static void main(String args[])
    {
        String s = "aaabbaa"; // "abbbcccaddef";
        RearrangeString(s);
    }
}
