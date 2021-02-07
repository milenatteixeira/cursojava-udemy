package exercicios2;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int y = s.nextInt();
		
		if(x>y) {
			if(x%y==0) {
				System.out.println("Sao Multiplos");
			}else {
				System.out.println("Nao sao Multiplos");
			}
		}else {
			if(y%x==0) {
				System.out.println("Sao Multiplos");
			}else {
				System.out.println("Nao sao Multiplos");
			}
		}
		
		
		s.close();
	}

}