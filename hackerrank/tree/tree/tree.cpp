#include <iostream>
#include "tree.hpp"

using namespace std;

/*
Output Format

Return the LCA of  and .

Sample Input

     4
   /   \
  2     7
 / \   /
1   3 6

v1=1, v2=7

Sample output
Return a pointer to the Root

*/

node* fill_tree_for_lca() {
	node* root = create_node(4);
	insert_bst_tree(root, 2);
	insert_bst_tree(root, 7);
	insert_bst_tree(root, 1);
	insert_bst_tree(root, 3);
	insert_bst_tree(root, 6);

	return root;
}

static int find_lca_naive(node* root, int v1, int v2, node** lca_node) {

	int left = 0;
	int right = 0;
	int current = 0;

	if (root->left != NULL) left = find_lca_naive(root->left, v1, v2, lca_node);
	if (root->right != NULL) right = find_lca_naive(root->right, v1, v2, lca_node);
	if (root->data == v1 || root->data == v2) current = 1;
	
	//cout << "d:" << root->data << ", left:" << left << ", right:" << right << ", current:" << current << endl;
	if( (left+right+current) == 2 && *lca_node == NULL)	{ 
		*lca_node = root;
		return 2;
	}

	return left + right + current;

}

node *lca(node *root, int v1, int v2)
{
	node* lca_node = NULL;

	find_lca_naive(root, v1, v2, &lca_node);

	return lca_node;

	
}

node* create_node(int data) {
	node* i_node = (node*)malloc(sizeof(node));
	memset(i_node, 0, sizeof(node));
	i_node->data = data;

	return i_node;
}

void insert_bst_tree(node* root, int data) {

	if (root == NULL) return;

	node* cur = root;
	while (true) {
		if (data < cur->data) {
			if (cur->left == NULL) {
				cur->left = create_node(data);
				break;
			}
			else {
				cur = cur->left;
			}
		}
		else if (data > cur->data) {
			if (cur->right == NULL) {
				cur->right = create_node(data);
				break;
			}
			else {
				cur = cur->right;
			}
		}
	}

}

void preOrder(node* i_node) {
	cout << i_node->data << " ";
	if (i_node->left != NULL) preOrder(i_node->left);
	if (i_node->right != NULL) preOrder(i_node->right);
}

void levelOrder(node * root) {

	node** queue = (node **) malloc(500 * sizeof(node**));
	int startIdx = 0;
	int endIdx = 0;

	queue[endIdx++] = root;
	while (startIdx < endIdx) {
		node * cur = queue[startIdx++];
		cout << cur->data << " ";
		if (cur->left != NULL) queue[endIdx++] = cur->left;
		if (cur->right != NULL) queue[endIdx++] = cur->right;
	}


}