/* create 2 random numbers for the problem
 * print out question multiplying random number 1 and 2
 * ask the user for a response
 * store user response
 * compare response to correct answer of problem
 * if correct display text stating "That is correct!"
 * if incorrect display text stating "that is incorrect"
 * allow user to retry question if first answer is incorrect
 * display correct answer
 */

import java.security.SecureRandom;
import java.util.Scanner;

public class CAI1 {	
	
	private int userAnswer, num1, num2;
	 
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		CAI1 quiz = new CAI1();
		quiz.askQuestion();
		quiz.readResponse();
		quiz.isAnswerCorrect();
		quiz.isAnswerIncorrect();
	}
		
		private void askQuestion() {	
			
			SecureRandom randomNumbers = new SecureRandom();
			
			num1 = randomNumbers.nextInt(10);
			num2 = randomNumbers.nextInt(10);
			
			System.out.println("How much is " + num1 + " times " + num2 + "?");
			
		}
		private void readResponse() {
			
			System.out.println("what is your answer?");
				userAnswer = sc.nextInt();
		
		}
		private void  isAnswerCorrect() {
			if(userAnswer == num1 * num2) {
				System.out.println("That is correct!");
			}
		}
		private void isAnswerIncorrect() {	
			if(userAnswer != num1 * num2) {
				System.out.println("No. Please try again");	
				do {
					System.out.println("What is your next guess?");
						userAnswer = sc.nextInt();
					}
					while(userAnswer != num1 * num2);
				if(userAnswer == num1* num2) {
					System.out.println("Yes, that is correct");
				}
			}				
		}
}

