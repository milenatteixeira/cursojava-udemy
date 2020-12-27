package exercicios1;
import java.util.Locale;
import java.util.Scanner;

public class Ex2 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		double raio;
		double area;
		Scanner s = new Scanner(System.in);
		
		raio = s.nextDouble();
		area = 3.14159*Math.pow(raio, 2);
		
		System.out.printf("A=%.4f\n", area);
		
		s.close();
	}

}
