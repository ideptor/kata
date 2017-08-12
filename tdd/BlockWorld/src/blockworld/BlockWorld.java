package blockworld;

import java.util.ArrayList;

public class BlockWorld {

	ArrayList<BlockHolder> blocks;
	
	public BlockWorld(int size) {
		 blocks = new ArrayList<>();
		 for(int i=0; i<size; i++) {
			 BlockHolder block = new BlockHolder(i);
			 blocks.add(block);
		 }
	}

	public BlockHolder get(int index) {
		if(index >= blocks.size() || index <0) return null;
		return blocks.get(index);
	}

}

