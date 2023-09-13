package misc_projects;

public class Fibonacci {
	
	public static long fibCalc(int n) 
	{
		long a = 0;
		long b = 1;
		long c = b + a;
		for(int i = 2; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return c;
	}
	public static void main (String[] args) 
	{
    	System.out.println(fibCalc(50));
    }
}
