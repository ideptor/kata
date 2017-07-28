package blockworld;

import java.util.ArrayList;

public class BlockHolder {
	ArrayList<Integer> blocks;
	
	public BlockHolder(int index) {
		 blocks = new ArrayList<>();
		 blocks.add(index);

	}
	
	public Object get(int index) {
		if(index>=blocks.size() || index <0) return null;
		return blocks.get(index);
	}

}
