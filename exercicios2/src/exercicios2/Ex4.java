package exercicios2;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int hi = s.nextInt();
		int hf = s.nextInt();
		
		if(hi>hf) {
			hf = hf + 24;
			System.out.printf("O JOGO DUROU %d HORA(S)\n", hf-hi);
		}else if(hi<hf) {
			System.out.printf("O JOGO DUROU %d HORA(S)\n", hf-hi);
		}else {
			System.out.println("O JOGO DUROU 24 HORA(S)");
		}
		
		s.close();
	}

}