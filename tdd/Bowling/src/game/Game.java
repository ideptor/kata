package game;

public class Game {

	private int[] rolls = new int[21];
	private int rollIdx = 0;

	public void roll(int pin) {
		rolls[rollIdx++] = pin;
	}

	public int score() {
		
		int score = 0;
		int firstIdxInFrame = 0;
		for(int frame=0; frame<10; frame++) {
			score += rolls[firstIdxInFrame] + rolls[firstIdxInFrame];
		}
		
		return score;
	}

}
