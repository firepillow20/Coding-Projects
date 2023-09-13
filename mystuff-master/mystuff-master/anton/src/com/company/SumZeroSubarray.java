package misc_projects;

import java.util.*;  

public class SumZeroSubarray { 
   
 static void subArrayCheck(int arr[]) 
 { 
     Set<Integer> SumSet = new HashSet<Integer>();  
     int sum = 0;      
     int count = 0;
     for (int i = 0; i < arr.length; i++) 
     {  
         sum += arr[i];  
         if (arr[i] == 0 || sum == 0 || SumSet.contains(sum))                          
             count++;
         SumSet.add(sum); 
     }  
     if (count == 1) {
     System.out.println("There is " + count + " subarray with sum 0."); 
     }
     else if (count > 1) {
     System.out.println("There are " + count + " subarrays with sum 0."); 
     }
     else {
     System.out.println("There are no subarrays with sum 0.");	
     }
 }
 public static void main(String arg[]) 
 { 
     int arr[] = {4, 2, -3, 1, 6}; 
     subArrayCheck(arr);          
 }          
}