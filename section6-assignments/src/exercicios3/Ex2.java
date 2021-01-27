package exercicios3;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int x = s.nextInt();
		int y = s.nextInt();
		
		while(x!=0&&y!=0) {
			if(x>0&&y>0) {
				System.out.println("primeiro");
			}else if(x>0&&y<0) {
				System.out.println("quarto");
			}else if(x<0&&y<0) {
				System.out.println("terceiro");
			}else if(x<0&&y>0) {
				System.out.println("segundo");
			}
			
			x = s.nextInt();
			y = s.nextInt();
		}
		
		s.close();
	}

}
