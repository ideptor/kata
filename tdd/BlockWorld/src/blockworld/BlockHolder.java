package blockworld;

import java.util.ArrayList;

public class BlockHolder {
	ArrayList<Integer> blocks;
	
	public BlockHolder(int index) {
		 blocks = new ArrayList<>();
		 blocks.add(index);

	}
	
	public Integer get(int index) {
		if(index>=blocks.size() || index <0) return null;
		return blocks.get(index);
	}

	public String print() {
		StringBuffer buf = new StringBuffer();
		for(int i:blocks) {
			buf.append(i).append(" ");
		}
		return buf.toString().trim();
	}

	public int move(int i) {
		// TODO Auto-generated method stub
		
	}

}
