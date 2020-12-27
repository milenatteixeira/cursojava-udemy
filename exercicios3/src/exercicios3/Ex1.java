package exercicios3;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int senha = 2002;
		int input = s.nextInt();
		
		while(input!=senha) {			
			System.out.println("Senha Invalida");
			input = s.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		
		
		s.close();
	}

}