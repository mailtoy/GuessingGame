package oop2;

/**
 * Game of guessing a secret number.
 * 
 * @author Kanchanok
 */
public class Main {

	/**
	 * The play method plays a game using input from a user.
	 * 
	 * @param create
	 *            object and start the game
	 * 
	 */
	public static void main(String[] arg) {
		GuessingGame game = new GuessingGame(10);
		GameConsole ui = new GameConsole();
		ui.play(game);

	}

}
