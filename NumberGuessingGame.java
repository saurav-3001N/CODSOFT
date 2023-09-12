package codSoft;
import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame {

	public static void main(String[] args) {
		int MinRange = 1;
		int MaxRange = 100;
		int score = 0;
		int MaxAttempts = 10;
		
		// create a Random class
		Random random = new Random();
		//Create a Scanner class for user input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the Number Guessing Game!");
		System.out.println("You can choose a number between "+ MinRange+" and "+MaxRange+": ");
		
		boolean playAgain = true;
		while (playAgain) {
			int targetNumber = random.nextInt(MaxRange - MinRange+1)+1;
			int attempts = 0;
			while (attempts < MaxAttempts) {
				System.out.println("Enter your guess number:");
				int userGuess = scanner.nextInt();
				attempts++;
				if (userGuess == targetNumber) {
					System.out.println("Congratulation! You guessed the correct number in"+attempts+"attempts ");
					score++;
					break;
					
				}
				else if(userGuess < targetNumber) {
					System.out.println("Too Low. Try again.");
				}
				else {
					System.out.println("Too high. Try again.");
					
				}
				if (attempts == MaxAttempts) {
					System.out.println("Sorry, you've the maximum number of attempts.");
					System.out.println("The correct number was:"+targetNumber);
				}
			}
			System.out.println("Do you want to play again? (yes/no)");
			String playAgainInput = scanner.next().toLowerCase();
			playAgain = playAgainInput.equals("yes");
		}
		System.out.println("Thanks for playing! your final score is: "+score);
		scanner.close();
			
		

	}

}
