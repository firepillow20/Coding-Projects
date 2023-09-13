package misc_projects;

public class RecursiveFactorial {
	
	public static int factCalc(int a) 
	{
		if (a <= 1) {
			return a;
		} 
		
		return a * factCalc(a - 1);
	}
	public static void main (String[] args) {
    	System.out.println(factCalc(7));
    }
}
