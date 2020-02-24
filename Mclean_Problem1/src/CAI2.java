/* create 2 random numbers for the problem
 * print out question multiplying random number 1 and 2
 * ask the user for a response
 * store user response
 * compare response to correct answer of problem
 * if correct display text stating "Very good!", "Keep up the good work!", "Excellent", "Nice Work!"
 * if incorrect display text stating "No please try again", Wrong. Try once more, Don't give up, No. Keep trying
 * randomize the correct and incorrect answer choices with a 1-4 randomizer
 * allow user to retry question if first answer is incorrect
 * 
 */

import java.security.SecureRandom;
import java.util.Scanner;

public class CAI2 {

	private int userAnswer, num1, num2;
	 
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		CAI2 quiz = new CAI2();
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
					SecureRandom rand = new SecureRandom();
					int ForRep = rand.nextInt(4)+1;
					switch (ForRep) {
					case 1:
					System.out.println("Very Good!");
					break;
					case 2:
					System.out.println("Excelent!");
					break;
					case 3:
					System.out.println("Nice Work!");
					break;
					case 4:
					System.out.println("Keep Up The Good Work");
					break;
			
					}}
		}
		private void isAnswerIncorrect() {	
			if(userAnswer != num1 * num2) {
				SecureRandom rand = new SecureRandom();
				int ForRep = rand.nextInt(4)+1;
				switch (ForRep) {
				case 1:
				do {
					System.out.println("No. Please try again.");
						userAnswer = sc.nextInt();
					}
					while(userAnswer != num1 * num2);
				if(userAnswer == num1* num2) {
					System.out.println("Yes, That is the correct answer.");
				}
				break;
				case 2:
				do {
					System.out.println("Wrong.Try Once More.");
						userAnswer = sc.nextInt();
					}
					while(userAnswer != num1 * num2);
				if(userAnswer == num1* num2) {
					System.out.println("Yes, That is the correct answer.");
				}
				break;
				case 3:
				do {
					System.out.println("Don't Give Up!");
						userAnswer = sc.nextInt();
					}
					while(userAnswer != num1 * num2);
				if(userAnswer == num1* num2) {
					System.out.println("Yes, That is the correct answer.");
				}
				break;
				case 4:
				do {
					System.out.println("No Keep Trying.");
						userAnswer = sc.nextInt();
					}
					while(userAnswer != num1 * num2);
				if(userAnswer == num1* num2) {
					System.out.println("Yes, That is the correct answer.");
				break;
				}
			}				
		}
		}
}
