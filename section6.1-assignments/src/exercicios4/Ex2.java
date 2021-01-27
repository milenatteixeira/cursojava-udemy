package exercicios4;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int n = s.nextInt();
			int i;		
			int cont1 = 0;
			int cont2 = 0;
					
			for(i=0;i<n;i++) {
				int x = s.nextInt();
				if(x>=10&&x<=20) {
					cont1++;
				}else {
					cont2++;
				}
			}
			s.close();
			
			System.out.printf("%d in\n%d out\n", cont1, cont2);
		}catch (Exception e) {
			System.out.println(e);
		}
	}

}
