package misc_projects;

public class BinaryRoot
{ 
    public static int findSqrt(int x) 
    { 
        if (x == 0 || x == 1) 
            return x; 
        int s = 1, e = x/2, ans = 0; 
        while (s <= e) 
        { 
            int m = (s + e) / 2; 
            if (m * m == x) 
                return m; 
            
            if (m * m < x) 
            { 
                s = m + 1; 
                ans = m; 
            } 
            else
                e = m - 1; 
        } 
        return ans; 
    }
    public static void main(String args[]) 
    { 
        int x = 1475146; 
        System.out.println(findSqrt(x)); 
    } 
} 