package misc_projects;

public class mergeSortedArrays 
{  
    static void sortedMerge(int a[], int b[])  
    { 
        int i = a.length - b.length - 1; 
        int j = b.length - 1; 
          
        int last = a.length - 1; 
        
        while (j >= 0)  
        { 
            if (i >= 0 && a[i] > b[j])  
            { 
                a[last] = a[i];  
                i--; 
            } else 
            {   
                a[last] = b[j];  
                j--; 
            } 
            last--;  
        } 
    } 
        
    static void printArray(int arr[], int n)  
    { 
        System.out.println ( "Merged Array A in order: " ) ; 
        for (int i = 0; i < n; i++) 
            System.out.print(arr[i] +", "); 
    } 
      
    public static void main (String[] args)  
    { 
        int a[] = {10, 12, 13, 14, 18, ' ', ' ', ' ', ' ', ' '};  
        int size_a = 10; 
        int b[] = {16, 17, 19, 20, 22};  
        sortedMerge(a, b); 
        printArray(a, size_a); 
    } 
} 