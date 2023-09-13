package misc_projects;

public class MagicSquare {
    static void findMagicSquare(int[][] a, int n){
        int dSum1 = 0;
        int dSum2 = 0;
        int cSum1 = 0;
        int cSum2 = 0;
        int cSum3 = 0;
        int rSum1 = 0;
        int rSum2 = 0;
        int rSum3 = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
            	dSum1 = dSum1 + a[i][j];
            }
        }
        for (int i = n - 1; i >= 0; i--){
            for (int j = n - 1; j >= 0; j--){
            	dSum1 = dSum1 + a[i][j];
            }
        }
        for (int i = 0; i < n; i++){
        	cSum1 = cSum1 + a[0][i];
        }
        for (int i = 0; i < n; i++){
        	cSum2 = cSum2 + a[1][i];
        }
        for (int i = 0; i < n; i++){
        	cSum3 = cSum3 + a[2][i];
        }
        for (int i = 0; i < n; i++){
        	rSum1 = rSum1 + a[i][0];
        }
        for (int i = 0; i < n; i++){
        	rSum2 = rSum2 + a[i][1];
        }
        for (int i = 0; i < n; i++){
        	rSum3 = rSum3 + a[i][2];
        }
        if (dSum1 == dSum2 && dSum1 == dSum2 && dSum1 == cSum1 && dSum1 == cSum2 && dSum1 == cSum3 && dSum1 == rSum1 && dSum1 == rSum2 && dSum1 == rSum3){
        	System.out.println("The square is a magic square.");
        }
        else {
        	System.out.println("The square is not a magic square.");
        }
    }
    public static void main(String[] args)
    {
        int a[][] = { { 2, 7, 6 },
                { 9, 5, 1 },
                { 4, 3, 8 } };
        int n = 3;
        findMagicSquare(a, n);
    }
}