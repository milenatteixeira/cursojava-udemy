package exercicios3;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int tipo = s.nextInt();
		int alcool = 0;
		int gas = 0;
		int dis = 0;
		
		while(tipo!=4) {
			if(tipo==1) {
				alcool++;
			}else if(tipo==2) {
				gas++;
			}else if(tipo==3) {
				dis++;
			}
			tipo = s.nextInt();
		}
		
		System.out.printf("MUITO OBRIGADO\n"
				+ "Alcool: %d\n"
				+ "Gasolina: %d\n"
				+ "Diesel: %d\n", alcool, gas, dis);
		
		s.close();
	}

}
