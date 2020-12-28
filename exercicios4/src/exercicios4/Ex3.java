package exercicios4;

import java.util.Locale;
import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		try(Scanner s = new Scanner(System.in)){
			int n = s.nextInt();
			int i;			
			double media = 0;
			
			for(i=0;i<n;i++) {
				double x = s.nextDouble();
				double y = s.nextDouble();
				double z = s.nextDouble();
				
				media = ((x*2)+(y*3)+(z*5))/10;
				System.out.printf("%.1f\n",media);
			}
			
			s.close();
		}catch (Exception e) {
			System.out.println(e);
		}
	}
}
