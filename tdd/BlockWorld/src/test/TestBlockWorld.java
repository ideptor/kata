package test;
import static org.junit.Assert.assertThat;

import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

import blockworld.Block;
import blockworld.BlockWorld;

public class TestBlockWorld {

	@Test
	public void create_block_world() {
		
		// given
		int n = 10;
		
		//when
		BlockWorld blockworld = new BlockWorld(n);
		
		// then
		for(int i=0; i<n; i++) {
			assertThat(blockworld.get(i) instanceof Block, is(true));
		}
		
		// edge case
		assertThat(blockworld.get(n), is(nullValue()));
		assertThat(blockworld.get(-1), is(nullValue()));
	}

}
