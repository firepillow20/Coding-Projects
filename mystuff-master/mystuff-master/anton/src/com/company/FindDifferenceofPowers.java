package misc_projects;

import java.util.*; 

class FindDifferenceofPowers{ 
	
static void findpowerdiff(int n) 
{ 
    for (int x = 1; x <= Math.sqrt(n); x++)  
    { 
        if (n % x == 0)  
        {   
            int i = n / x; 
            if (x % 2 == i % 2)  
            { 
                int a = (x + i) / 2; 
                int b = (i - x) / 2; 
  
                System.out.print(a + " " + b); 
                return; 
            } 
        } 
    } 
    System.out.print("none"); 
} 
public static void main(String args[]) 
{ 
    int n = 540;
  
    findpowerdiff(n); 
} 
} 