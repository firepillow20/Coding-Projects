package com.company;
import java.util.*;

public class FindIdenticalSums
{
    class pair
    {
        int first, second;
        pair(int f,int s)
        {
            first = f; second = s;
        }
    };
    void findSums (int arr[])
    {
        HashMap<Integer, pair> myMap = new HashMap<Integer, pair>();
        int n = arr.length;
        for (int i = 0; i < n; ++i)
        {
            for (int j = i + 1; j < n; ++j)
            {
                int sum = arr[i] + arr[j];
                if (!myMap.containsKey(sum))
                {
                    myMap.put(sum, new pair(i, j));
                    System.out.println(myMap.entrySet());
                }
                else
                {
                    pair p = myMap.get(sum);
                    System.out.println("(" + arr[p.first] + "," + arr[p.second] + ")" + " and " + "(" + arr[i] + "," + arr[j] +")");
                    return;
                }
            }
        }
    }
    public static void main(String[] args)
    {
        int arr[] = {3, 4, 7, 1, 2, 9, 8};
        FindIdenticalSums FS = new FindIdenticalSums();
        FS.findSums(arr);
    }
}
