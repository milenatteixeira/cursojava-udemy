package exercicios1;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		int x;
		int y;
		int soma;
		
		Scanner s = new Scanner(System.in);
		
		x = s.nextInt();
		y = s.nextInt();
		soma = x+y;
		
		System.out.println("SOMA = "+soma);
		
		s.close();
	}

}