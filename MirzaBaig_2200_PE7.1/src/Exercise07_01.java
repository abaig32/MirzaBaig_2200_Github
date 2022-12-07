/*******
 * 
 * @author Mirza Baig 
 * Date: 11/30/2022 [W]
 * 		 12/07/2022 [W]
 *
 */

import java.util.Scanner;
public class Exercise07_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		// Get number of students 
		System.out.print("Enter the number of students: ");
		int numberOfStudents = input.nextInt();
		double[] scores = new double[numberOfStudents]; // Array of scores to be input by the user
		double best = 0; // The best score to be computed (assume all scores >= 0)
		
		// Read scores and find the best (i.e. the max) 
		System.out.print("Enter " + numberOfStudents + " scores: ");
		for (int i = 0; i < numberOfStudents; i++) {
			
			scores[i] = input.nextDouble();
			// Check if value read is bigger than the best so far
			if (scores[i] > best) {
				
				best = scores[i];
			}
			
		}
		
		// Declare and initialize the letter-grade
		
		char grade; 
		
		//Assign and display grades
		for(int i = 1; i < numberOfStudents;i++) {
			
			if(scores[i] >= best - 10) grade = 'A';
			else if (scores[i] >= best - 20) grade = 'B';
			else if(scores[i] >= best - 30) grade = 'C';
			else if(scores[i] >= best - 40) grade = 'D';
			else grade = 'F';
			
			System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + grade);
			


			
		}
		
	
		
		input.close();

	}

}
