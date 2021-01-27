package exercicios1;
import java.util.Locale;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		int code;
		int hours;
		double value;
		double salary;
		
		Scanner s = new Scanner(System.in);
		
		code = s.nextInt();
		hours = s.nextInt();
		value = s.nextDouble();
		salary = hours*value;
		
		System.out.printf("NUMBER = %d\nSALARY = U$ %.2f\n", code, salary);
		
		s.close();
	}

}