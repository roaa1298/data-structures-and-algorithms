# Trees
- The tree data structure is a non-linear data structure because it does not store in a sequential manner. It is a hierarchical structure as elements in a Tree are arranged in multiple levels. so the tree has a root node at the begging of the tree, and every node has left and right nodes(children) , and we called the nodes that don't have children nodes by leafs at the end of the tree. The edge in a tree is the link between a parent and child node. so the height of the tree is the number of edges from the root to the furthest leaf.  
- The insertion in the binary tree is from left to right, whereas the binary search tree we add the value less than the root to the left and the greater to the right and so on.

## Challenge
#### Node
- Create a Node class that has properties for the value stored in the node, the left child node, and the right child node.
#### Binary Tree
- Create a Binary Tree class: Define a method for each of the depth first traversals:  
    - pre order  
    - in order  
    - post order which returns an array of the values, ordered appropriately.  
#### Binary Search Tree  
- Create a Binary Search Tree class : This class should be a sub-class (or your languages equivalent) of the Binary Tree Class, with the following additional methods:  
    - Add  
      - Arguments: value  
      - Return: nothing  
      - Adds a new node with that value in the correct location in the binary search tree.
    - Contains  
      - Argument: value  
      - Returns: boolean  
      - indicating whether or not the value is in the tree at least once.




## Approach & Efficiency
- i used the recursion for my methods.
- the big O for binary tree is O(n).
- the big O for binary search tree is O(log n).

## API
#### Binary tree
- preOrder: a method accept Node root as a parameter and print a list contain the tree values in (root,left,right) order, and add the values to the array list.  
- inOrder: a method accept Node root as a parameter and print a list contain the tree values in (left,root,right) order, and add the values to the array list.  
- postOrder: a method accept Node root as a parameter and print a list contain the tree values in (left,right,root) order, and add the values to the array list.  
- traverse : a method accept TraversalOrder (INORDER, or PREORDER, or POSTORDER) and then call the method as the order from the argument and return array list contains the tree values in a specific order.  
#### Binary search tree  
- add: a method accept a value and add it to a certain location in the tree whereas the left node is smaller than the root and the right node is bigger than the root.  
- contains: a method which take a value and a root node as parameters and search for that value in the tree based on binary search concepts.
