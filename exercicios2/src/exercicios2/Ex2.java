package exercicios2;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		input.close();
		
		if (number%2==0) System.out.println("PAR");
		else System.out.println("IMPAR");
	}
}
