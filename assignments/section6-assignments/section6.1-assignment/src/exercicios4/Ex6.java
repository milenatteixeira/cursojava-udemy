package exercicios4;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		Scanner s = null;
		
		try {
			s = new Scanner(System.in);
			int x = s.nextInt();
			int i;
			
			for(i=1;i<=x;i++) {
				if(x%i==0) {
					System.out.println(i);
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