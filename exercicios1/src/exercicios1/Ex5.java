package exercicios1;
import java.util.Locale;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		int qtd1;
		int qtd2;
		double p1;
		double p2;
		double total;
		
		Scanner s = new Scanner(System.in);
			
		qtd1 = s.nextInt();
		p1 = s.nextDouble();
		qtd2 = s.nextInt();		
		p2 = s.nextDouble();
		total = (qtd1*p1)+(qtd2*p2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
		
		s.close();
	}

}