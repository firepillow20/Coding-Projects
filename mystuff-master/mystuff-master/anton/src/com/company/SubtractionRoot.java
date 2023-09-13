package misc_projects;

public class SubtractionRoot{ 
	
	public static int SubSqrt(int x)  
	{  
	    int count = 0;  
	      
	    for(int n = 1; n <= x; n = n + 2)  
	    {   
	       x = x - n;  
	       count = count + 1;  
	       if (x == 0)  
	           break;  
	    }  
	    return count;  
	}   
	public static void main(String[] args) 
	{ 
	    int N = 81;  
	    System.out.println(SubSqrt(N)); 
	} 
	} 
