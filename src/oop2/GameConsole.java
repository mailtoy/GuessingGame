package oop2;

import java.awt.Checkbox;
import java.util.Scanner;

/**
 * Game of guessing a secret number.
 * 
 * @author Kanchanok
 */
public class GameConsole {

	/**
	 * 
	 * @param play
	 *            game on the console
	 * @return the secret number when user guesses it.
	 */
	public int play(GuessingGame game) {
		System.out.println("Guessing Game!");
		Scanner scan = new Scanner(System.in);
		System.out.println(game.getHint());
		int num = 0;
		boolean check;
		do {
			System.out.print("What is your guess? ");
			num = scan.nextInt();
			check = game.guess(num);
			System.out.println(game.getHint());

		} while (!check);

		System.out.println("You used " + game.getCount() + " guesses times.");
		return num;

	}

}
