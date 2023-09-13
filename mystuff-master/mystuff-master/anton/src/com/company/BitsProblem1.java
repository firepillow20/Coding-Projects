package misc_projects;

public class BitsProblem1 { 
    public static int walkerCalc(int n) 
    { 
        if (n == 0) 
            return 0; 
        else
            return (n & 1) + walkerCalc(n >> 1); 
    } 
    public static void main(String[] args) 
    { 
        int n = 9; 
        System.out.println(walkerCalc(n)); 
    } 
} 
