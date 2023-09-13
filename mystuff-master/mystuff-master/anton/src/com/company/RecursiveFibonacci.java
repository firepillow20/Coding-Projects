package misc_projects;

public class RecursiveFibonacci {
	
	public static int fibCalc(int a) 
	{
		if (a <= 1) {
			return a;
		} 
		
		return fibCalc(a - 1) + fibCalc(a - 2);
	}
	public static void main (String[] args) {
    	System.out.println(fibCalc(7));
    }
}
