#include <iostream>
#include "tree.hpp"

using namespace std;




void main() {

	cout << "start" << endl;
	node* root = fill_tree_for_lca();

	cout << "call" << endl;
	node* lca_node = lca(root, 1, 7);
	
	cout << lca_node->data;
}

