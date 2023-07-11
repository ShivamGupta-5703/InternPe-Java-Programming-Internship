// Task --> Make a Guess a number game in Java.

package InternPe.Task_3;

import java.util.Random;
import java.util.Scanner;

public class Number_Guessing_Game {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String play = "yes";

		// while loop to determine if we are going to play
		while (play.equals(("yes"))) {
			Random rand = new Random();
			int randNum = rand.nextInt(100);
			int guess = -1;
			int tries = 0;

			// while loop to check if game is over
			while (guess != randNum) {
				System.out.println("Guess a number between 1 and 100: ");
				guess = sc.nextInt();
				tries++;

				if (guess == randNum) {
					System.out.println("Awesome !! You guessed right.");
					System.out.println("It only took you " + tries + " guesses !!");
					System.out.print("Would you like to play again ? Yes or No: ");
					play = sc.next().toLowerCase();
				} 
				else if (guess > randNum) {
					System.out.println("Your guess is too high , try again...");
				} 
				else {
					System.out.println("Your guess is too low , try again...");
				}
			}
		}
		sc.close();
	}
}
