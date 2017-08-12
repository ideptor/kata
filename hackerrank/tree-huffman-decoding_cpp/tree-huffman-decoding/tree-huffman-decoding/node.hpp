/*
 * node.h
 *
 *  Created on: 2017. 8. 12.
 *      Author: idept
 */

#ifndef NODE_H_
#define NODE_H_

#include <iostream>

using namespace std;

typedef struct node
{
    int freq;
    char data;
    node* left;
    node* right;

}node;


void decode_huff(node * root, string s);



#endif /* NODE_H_ */
