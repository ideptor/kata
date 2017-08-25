package main;

public class Node {

	public int frequency; // the frequency of this tree
	public char data;
	public Node left; 
	public Node right;
	
	public Node(char data, int frequency) {
		this.data = data;
		this.frequency = frequency;
	}
}
