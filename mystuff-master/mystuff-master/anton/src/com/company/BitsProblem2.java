package misc_projects;

public class BitsProblem2 { 
    static int rightmostBit(int n)  
    { 
        return (int)((Math.log10(n & -n)) / Math.log10(2)) + 1; 
    } 
    static int rightmostBitPos(int m, int n)  
    { 
        return rightmostBit(m ^ n); 
    } 
    public static void main(String arg[]) 
    { 
        int m = 6, n = 4; 
        System.out.print("Position = " +  
            rightmostBitPos(m, n)); 
    } 
} 