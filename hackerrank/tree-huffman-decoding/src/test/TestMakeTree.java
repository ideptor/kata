package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Decode;
import main.Node;

public class TestMakeTree {

	@Test
	public void test() {
		// given
		Node root = new Node('\0',5);
		Node node1 = new Node('\0',2);
		root.left = node1;
		root.right = new Node('A', 3);
		
		node1.left = new Node('B', 1);
		node1.right = new Node('C', 1);
		
		// when
		String decoded = Decode.decode("1001011", root);
		
		// then
		System.out.println(decoded);
		
	}

}
