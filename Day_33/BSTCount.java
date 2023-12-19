/*
Given two BSTs containing N1 and N2 distinct nodes respectively and given a value x, your task is to complete the function countPairs(), that returns the count of all pairs of (a, b), where a belongs to one BST and b belongs to another BST, such that a + b = x.

Example 1:

Input:
BST1:
       5
     /   \
    3     7
   / \   / \
  2   4 6   8
BST2:
       10
     /    \
    6      15
   / \    /  \
  3   8  11   18
x = 16
Output:
3
Explanation:
The pairs are: (5, 11), (6, 10) and (8, 8)
Example 2:

Input:
BST1:
  1
   \
    3
   /
  2
BST2:
    3
   / \
  2   4
 /     
1
x = 4
Output:
3
Explanation:
The pairs are: (2, 2), (3, 1) and (1, 3)
*/

//Code 
 if(node == null) return 0;
        if(node.data == k) {
            return 1;
        }
        else if(node.data > k) return traverse(node.left,k);
        else return traverse(node.right,k);
    }
    public static int countPairs(Node root1, Node root2, int x)
    {
        if(root1 == null) return 0;
        return traverse(root2,x-root1.data) + countPairs(root1.left,root2,x) + countPairs(root1.right,root2,x);
    }
