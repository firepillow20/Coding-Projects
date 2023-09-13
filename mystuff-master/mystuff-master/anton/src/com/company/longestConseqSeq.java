package misc_projects;

import java.util.*; 

public class longestConseqSeq 
{
	static int ConseqSubseq(int arr[], int n) 
	{
        HashSet<Integer> set = new HashSet<Integer>(); 
        int ans = 0; 
  
 
        for (int i = 0; i < n; ++i) 
            set.add(arr[i]); 
  

        for (int i = 0; i < n; ++i) 
        { 

            if (!set.contains(arr[i]-1)) 
            { 

                int m = arr[i]; 
                while (set.contains(m)) 
                    m++; 
  
                if (ans < m - arr[i]) 
                    ans = m - arr[i]; 
            }
        }
        return ans;
	}
	public static void main(String args[]) 
	{ 
	    int arr[] =  {9, 6, 1, 4, 10, 2, 3, 78}; 
	    int n = arr.length; 
	    System.out.println("Length of the longest consecutive subsequence is " + ConseqSubseq(arr, n)); 
	} 
}

