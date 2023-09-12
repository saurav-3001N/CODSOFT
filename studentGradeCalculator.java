
/*
 * Input: Take marks obtained (out of 100) in each subject.

Calculate Total Marks: Sum up the marks obtained in all subjects.

Calculate Average Percentage: Divide the total marks by the total number of subjects to get the
average percentage.

Grade Calculation: Assign grades based on the average percentage achieved.

Display Results: Show the total marks, average percentage, and the corresponding grade to the use*/

/*........................................**********************************...........................*/


package codSoft;
import java.util.*;
public class studentGradeCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of subjects");
		int numberSubjects = scanner.nextInt();
		
		//Input Marks should be take as (out of 100) in each subject
		int totalMarks = 0;
		for(int i= 1; i<= numberSubjects; i++) {
			
			System.out.println("Enter the Marks of subject"+i+": ");
			int Marks = scanner.nextInt();
			totalMarks += Marks;
			
		}
             // Calculate the total Marks
		System.out.println("The total Marks is:"+ totalMarks);
		
		double AveragePercentage = (double) totalMarks/numberSubjects;
		System.out.println("The Average Percentage is:"+ AveragePercentage);
	
	// Grade Calculation which should assign grades based in average percentage
		
		String grade;
		if  (AveragePercentage >= 90) {
			grade = "A+";
		}
		else if (AveragePercentage >= 80) {
			grade = "A";
		}
		else if (AveragePercentage >= 70) {
			grade = "B+";
		}
		else if (AveragePercentage >= 60) {
			grade = "B";
		}
		else if (AveragePercentage >= 50) {
			grade = "C+";
		}
		else if (AveragePercentage >= 40) {
			grade = "C";
		}
		
	else if (AveragePercentage >= 30) {
		grade = "D";
	}
	else {
		grade ="F";
	}
	System.out.println("The student grade is:"+grade);

}
}
