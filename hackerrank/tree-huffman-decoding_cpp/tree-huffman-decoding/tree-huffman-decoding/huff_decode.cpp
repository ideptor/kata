#include <iostream>

#include "node.hpp"


using namespace std;

static node* _find_leaf(node* i_node, string s, int* curIdx) {
	if (i_node->left == NULL && i_node->right == NULL) return i_node;
	*curIdx += 1;

	if (s[*curIdx-1] == '0') return _find_leaf(i_node->left, s, curIdx);
	else return _find_leaf(i_node->right, s, curIdx);


}

void decode_huff(node * root, string s)
{
	int curIdx = 0;
	while (curIdx < s.size())
	{
		node* leaf_node = _find_leaf(root, s, &curIdx);
		cout << leaf_node->data;
	}
}