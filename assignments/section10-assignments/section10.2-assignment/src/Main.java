import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int m = input.nextInt();
		int n = input.nextInt();
		
		int[][] mat = new int[m][n];
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				mat[i][j] = input.nextInt();
			}
		}
		
		int x = input.nextInt();
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				int number = mat[i][j];
				if(number==x) {
					System.out.printf("\nPosition %d.%d\n", i, j);
					String left = ((j-1) >= 0 ? ("\nLeft: " + mat[i][j-1]) : "");
					System.out.print(left);
					String right = ((j+1) < mat[i].length ? ("\nRight: " + mat[i][j+1]) : "");
					System.out.print(right);
					String up = ((i-1) >= 0 ? ("\nUp: " + mat[i-1][j]) : "");
					System.out.print(up);
					String down = ((i+1) < mat.length ? ("\nDown: " + mat[i+1][j]) : "");
					System.out.print(down);
				}
			}
		}
		
		input.close();
	}

}
