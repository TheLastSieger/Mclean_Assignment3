/* create 2 random numbers for the problem
 * print out question multiplying random number 1 and 2
 * ask the user for a response
 * store user response
 * compare response to correct answer of problem
 * if correct display text stating "Very good!", "Keep up the good work!", "Excellent", "Nice Work!"
 * if incorrect display text stating "No please try again", Wrong. Try once more, Don't give up, No. Keep trying
 * randomize the correct and incorrect answer choices with a 1-4 randomizer
 * loop program 10 times to allow user to enter 10 questions
 * store correct number of answers
 * calculate percent based score depending on answers correct
 * display 2 different prompts if score is <75 or >75
 * 
 */

import java.util.Scanner;
import java.security.SecureRandom;

public class CAI3 {

	private int userAnswer, num1, num2; 
	private double score = 0;
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		CAI3 quiz = new CAI3();
		
		for (int i = 0; i <= 9; i++) {
		quiz.askQuestion();
		quiz.readResponse();
		quiz.isAnswerCorrect();
		quiz.isAnswerIncorrect();
		quiz.userScore();
		}	
		quiz.scoreCalculation();
	}
		
		private void askQuestion() {	
			
			SecureRandom randomNumbers = new SecureRandom();
			
			num1 = randomNumbers.nextInt(10);
			num2 = randomNumbers.nextInt(10);
			
			System.out.println("How much is " + num1 + " times " + num2 + "?");
			
		}
		private void readResponse() {
			
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
					System.out.println("No. Please try again.");
				break;
				case 2:
					System.out.println("Wrong.Try Once More.");
				break;
				case 3:
					System.out.println("Don't Give Up!");
				break;
				case 4:
					System.out.println("No Keep Trying.");
				break;
				}	
			}
			}				
			private void userScore() {
				if((userAnswer) == num1 * num2) {
					score++;	
				}		
			}
			private void scoreCalculation() {
				double percent;
				percent = (score/10) * 100;
				System.out.printf("Your grade is %n%f%n", + percent);
				
				if(percent >= 75) {
					System.out.println("Congratulations, you are ready to go to the next level!");
				}
				else {
					System.out.println(" Please ask your teacher for extra help.");										
				}
			}				
}


