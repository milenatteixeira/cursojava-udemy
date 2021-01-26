package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		Student student = new Student();
		
		student.name = input.nextLine();
		student.gradeOne = input.nextDouble();
		student.gradeTwo = input.nextDouble();
		student.gradeThree = input.nextDouble();
		
		System.out.println(student);
		
		student.isApproved(student.finalGrade());
		
		input.close();
	}

}
