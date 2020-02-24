import java.util.Scanner;
import java.security.SecureRandom;

	import java.security.SecureRandom;
	import java.util.Scanner;
	public class CAI5 {
		private int userAnswer, num1, num2, problemType;
		private double score = 0;
		static Scanner sc = new Scanner(System.in);
		SecureRandom randomNumbers = new SecureRandom();
		
		public static void main(String[] args) {
			
			CAI5 quiz = new CAI5();
			for (int i = 0; i <= 9; i++) {
			quiz.readDifficulty();
			quiz.arithemeticType();
			quiz.askQuestion();
			quiz.readResponse();
			quiz.isAnswerCorrect();
			quiz.isAnswerIncorrect();
			quiz.userScore();
			}	
			quiz.scoreCalculation();
		}
			private void readDifficulty() {
				System.out.println("Please choose a difficulty 1, 2, 3, 4");
				int level = sc.nextInt();
				if (level == 1) {
					num1 = randomNumbers.nextInt(10);
					num2 = randomNumbers.nextInt(10);
				}
				if (level == 2) {
					num1 = randomNumbers.nextInt(100);
					num2 = randomNumbers.nextInt(100);
				}
				if (level == 3) {
					num1 = randomNumbers.nextInt(1000);
					num2 = randomNumbers.nextInt(1000);
				}
				if (level == 4) {
					num1 = randomNumbers.nextInt(1000);
					num2 = randomNumbers.nextInt(1000);
				}
								
				}
			private void arithemeticType() {
				System.out.println("Please choose a type of problem 1-5");
				problemType = sc.nextInt();
			}
				private void askQuestion() {
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
