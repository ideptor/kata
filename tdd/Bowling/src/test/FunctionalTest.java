package test;

import static org.junit.Assert.*;

import org.junit.Test;

import game.Game;

public class FunctionalTest {

	@Test
	public void test() {
		int[] rolls = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
		Game game = new Game();
		for(int i=0; i<rolls.length; i++) {
			game.roll(rolls[i]);
		}
		assertEquals(20, game.score());
	}

}
