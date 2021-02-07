package entities;

public class Student {
	public String name;
	public double gradeOne;
	public double gradeTwo;
	public double gradeThree;
	
	public double finalGrade() {
		return gradeOne + gradeTwo + gradeThree;
	}
	
	public void isApproved(double finalGrade) {
		if(finalGrade>60) {
			System.out.println("PASS");
		}else {
			System.out.println("FAILED\nMISSING " + String.format("%.2f", 60-finalGrade) + " POINTS.");
		}
	}
	
	@Override
	public String toString() {
		return "\nFINAL GRADE = " + String.format("%.2f", finalGrade());
	}
}
