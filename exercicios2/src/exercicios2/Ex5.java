package exercicios2;

import java.util.Locale;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		
		double p1 = 4.0;
		double p2 = 4.5;
		double p3 = 5.0;
		double p4 = 2.0;
		double p5 = 1.5;
		int op = s.nextInt();
		int qtd = s.nextInt();		
		
		switch(op) {
			case 1:
				System.out.printf("Total: R$ %.2f\n", qtd*p1);
				break;
			case 2:
				System.out.printf("Total: R$ %.2f\n", qtd*p2);
				break;
			case 3:
				System.out.printf("Total: R$ %.2f\n", qtd*p3);
				break;
			case 4:
				System.out.printf("Total: R$ %.2f\n", qtd*p4);
				break;
			case 5:
				System.out.printf("Total: R$ %.2f\n", qtd*p5);
				break;			
		}
		
		s.close();
	}

}
