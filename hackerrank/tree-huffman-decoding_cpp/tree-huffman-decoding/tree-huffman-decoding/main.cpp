/*
 * main.c
 *
 *  Created on: 2017. 8. 12.
 *      Author: idept
 */

#include "node.hpp"

#include <iostream>

using namespace std;

node* create_node(char data, int freq) {
	node* i_node = (node*) malloc(sizeof(node));
	memset(i_node, 0, sizeof(node));
	i_node -> data = data;
	i_node -> freq = freq;

	return i_node;
}

node* maketree() {
	node* root = create_node('\0', 5);
    node* node1 = create_node('\0', 2);

    root -> left = node1;
    root -> right = create_node('A', 3);

    node1->left = create_node('B',1);
    node1->right = create_node('C',1);

    return root;
}


void inorder(node *node) {
	printf("{%c,%d}", node->data, node->freq);
	if(node->left != NULL) inorder(node->left);
	if(node->right != NULL) inorder(node->right);
}

int main(void) {

	node *root = maketree();

	string s = "1001011";  
	decode_huff(root, s); // expected: ABACA

}



