package misc_projects;

import java.util.*; 
  
public class sumOfabcd 
{ 
    class pair 
    { 
        int first, second; 
        pair(int m,int n) 
        { 
            first = m; second = n; 
        } 
    }
  
    boolean findPairs(int arr[]) 
    { 
        HashMap<Integer,pair> pairs = new HashMap<Integer,pair>(); 
        int n = arr.length; 
  
        for (int i = 0; i < n; ++i) 
        { 
            for (int j = i + 1; j < n; ++j) 
            { 

                int sum = arr[i] + arr[j]; 
                if (!pairs.containsKey(sum)) 
                    pairs.put(sum,new pair(i, j)); 
  
                else
                { 
                    pair p = pairs.get(sum); 
                    System.out.println("(" + arr[p.first]+", " + arr[p.second] + ") and (" + arr[i]+", " + arr[j] + ")"); 
                    return true; 
                } 
            } 
        } 
        return false; 
    }
    public static void main(String args[]) 
    { 
        int arr[] = {3, 4, 7, 1, 2, 9, 8}; 
        sumOfabcd a = new sumOfabcd(); 
        a.findPairs(arr); 
    } 
}
  