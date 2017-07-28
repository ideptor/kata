package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import game.Game;

public class UnitTest {

	
	private Game game;
	

	public void rollMany(int pin, int n) {
		for(int i=0; i<n; i++) {
			game.roll(pin);
		}
	}


	
	@Before
	public void setUp() {
		game = new Game();
	}
	
	
	@Test
	public void testGutterGame() {
		rollMany(0, 20);
		assertEquals(0, game.score());
	}


	@Test
	public void testAllOnes() {
		rollMany(1, 20);
		assertEquals(20, game.score());
	}
	
	// spare
	@Ignore
	@Test
	public void testSpare() {
		game.roll(5);
		game.roll(5); // spare
		game.roll(5);
		assertEquals(10+5+5, game.score());
	}
	
	// guttor game

}
