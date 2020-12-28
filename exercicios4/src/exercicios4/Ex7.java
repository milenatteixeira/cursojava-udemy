package exercicios4;

import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		Scanner s = null;
		
		try {
			s = new Scanner(System.in);
			int x = s.nextInt();
			int i;
			
			for(i=1;i<=x;i++) {
				System.out.printf("%d %d %d\n", i, i*i, i*i*i);
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
