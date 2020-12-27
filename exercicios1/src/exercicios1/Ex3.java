package exercicios1;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		int A;
		int B;
		int C;
		int D;
		int DIFERENCA;
		
		Scanner s = new Scanner(System.in);
		
		A = s.nextInt();
		B = s.nextInt();
		C = s.nextInt();
		D = s.nextInt();
		
		DIFERENCA = (A*B - C*D);
		
		System.out.printf("DIFERENCA = %d\n", DIFERENCA);
		
		s.close();
	}

}