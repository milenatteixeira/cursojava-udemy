package exercicios4;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		int i;
		
		input.close();
		
		for(i=1;i<=x;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
		
		
	}

}
