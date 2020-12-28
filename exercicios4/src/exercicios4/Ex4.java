package exercicios4;

import java.util.Locale;
import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = null;
		try{
			s = new Scanner(System.in);
			int n = s.nextInt();
			int i;
			
			for(i=0;i<n;i++) {
				double x = s.nextDouble();
				double y = s.nextDouble();
				
				if(y!=0) {
					System.out.printf("%.1f\n", x/y);
				}else {
					System.out.println("divisao impossivel");
				}
			}
			
		}catch (Exception e) {
			System.out.println(e);
		}finally {
			if(s!=null) {
				s.close();
			}
		}
	}
}
