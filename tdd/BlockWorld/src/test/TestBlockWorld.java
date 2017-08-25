package test;
import static org.junit.Assert.assertThat;

import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

import blockworld.BlockHolder;
import blockworld.BlockWorld;

public class TestBlockWorld {

	@Test
	public void create_blockworld() {
		
		// given
		int n = 10;
		
		//when
		BlockWorld blockworld = new BlockWorld(n);
		
		// then
		for(int i=0; i<n; i++) {
			assertThat(blockworld.get(i) instanceof BlockHolder, is(true));
		}
		
		// edge case
		assertThat(blockworld.get(n), is(nullValue()));
		assertThat(blockworld.get(-1), is(nullValue()));
	}
	
	@Test
	public void create_blockworld_with_properBlocks() {
		// given
		int n = 10;
		
		//when
		BlockWorld blockworld = new BlockWorld(n);
		
		// then
		for(int i=0; i<n; i++) {
			BlockHolder blocks = blockworld.get(i);
			assertThat(blocks.get(0), is(i));
		}
		
		//edge case
		BlockHolder blocks = blockworld.get(0);
		assertThat(blocks.get(1), is(nullValue()));
		assertThat(blocks.get(-1), is(nullValue()));
	}
	
	@Test
	public void test_move() {
		// given
		int n = 10;
		BlockWorld blockworld = new BlockWorld(n);
		BlockHolder blocks = blockworld.get(1);
		assertThat(blocks.print(), is("1"));
		
		// when
		int block = blocks.move(1);
		
		// then
		assertThat(block, is(1));	
		assertThat(blocks.print(), is(""));
	}

}
