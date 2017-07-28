package blockworld;

import java.util.ArrayList;

public class BlockWorld {

	ArrayList<Block> blocks;
	
	public BlockWorld(int size) {
		 blocks = new ArrayList<>();
		 for(int i=0; i<size; i++) {
			 Block block = new Block();
			 blocks.add(block);
		 }
	}

	public Block get(int index) {
		if(index >= blocks.size() || index <0) return null;
		return blocks.get(index);
	}

}

