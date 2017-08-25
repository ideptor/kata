#pragma once

typedef struct node
{
	int data;
	node* left;
	node* right;
} node;

node* create_node(int data);
void insert_bst_tree(node* root, int data);
void preOrder(node* i_node);
void levelOrder(node * root);
node* fill_tree_for_lca();
node *lca(node *root, int v1, int v2);