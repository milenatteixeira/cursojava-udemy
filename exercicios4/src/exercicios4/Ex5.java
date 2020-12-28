package exercicios4;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		Scanner s = null;
		
		try {
			s = new Scanner(System.in);			
			int x = s.nextInt();
			int i;
			int fat = 1;
			
			for(i=x;i>0;i--) {
				fat *= i; 
			}
			
			System.out.println(fat);
			
			
		}catch (Exception e) {
			System.out.println(e);
		}finally {
			if(s!=null) {
				s.close();
			}
		}
	}
}
