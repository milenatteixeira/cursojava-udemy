package exercicios2;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number = input.nextInt();
		
		if (number<0) System.out.println("NEGATIVO");
		else System.out.println("NAO NEGATIVO");
		
		input.close();
	}
}
