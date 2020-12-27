package exercicios2;

import java.util.Locale;
import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		
		double x = s.nextDouble();
		
		if(x>0 && x<=2000) {
			System.out.println("Isento");
		}else if(x>2000 && x<=3000) {
			System.out.printf("R$ %.2f\n", (x-2000)*0.08);
		}else if(x>3000 && x<=4500) {
			System.out.printf("R$ %.2f\n", (x-3000)*0.18+80);
		}else if(x>4500) {
			System.out.printf("R$ %.2f\n", (x-4500)*0.28+350);
		}
		
		s.close();
	}

}
