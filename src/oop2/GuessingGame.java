package oop2;

import java.util.Random;

/**
 * Game Console of guessing a secret number.
 * 
 * @author Kanchanok Kannee
 */
public class GuessingGame {
	private int upperBound;
	private int secret;
	private String hint;
	private int count;

	/**
	 * Initialize a new game.
	 * 
	 * @param upperbound is the max value for the secret number (>1).
	 */

	GuessingGame(int upperBound) {
		this.upperBound = upperBound;
		this.count = 0;
		this.secret = getRandomNumber(upperBound);
		this.hint = "I'm thinking of a number between 1 and " + upperBound;

	}

	/**
	 * Create a random number between 1 and limit.
	 * 
	 * @param limit is the upper limit for random number
	 * @return a random number between 1 and limit (inclusive)
	 */
	private int getRandomNumber(int limit) {
		long seed = System.currentTimeMillis();
		Random rand = new Random(seed);
		return rand.nextInt(limit) + 1;
	}

	/**
	 * Guess a number based on a user's input
	 * 
	 * @param evaluate the user's guess
	 * @return true or false. Also prepare a hint.
	 */
	public boolean guess(int number) {

		boolean check = false;
		if (number == secret) {
			check = true;
			setHint("Correct The secret is " + number);
			count++;
			return check;
		} else {
			check = false;
			if (secret > number) {
				setHint("Sorry,your guess is too small");
			} else {
				setHint("Sorry,your guess is too large");

			}
			count++;
			return check;
		}

	}

	/**
	 * Return a hint based on the most recent guess.
	 * 
	 * @return hint based on most recent guess
	 */
	public String getHint() {
		return hint;

	}

	/**
	 * set the text of hint
	 * 
	 * @param hint is the text that you want to change
	 */
	public void setHint(String hint) {
		this.hint = hint;
	}

	/**
	 * Return a count based on the most recent guess.
	 * 
	 * @return count based on most recent guess
	 */

	public int getCount() {
		return count;
	}


}
