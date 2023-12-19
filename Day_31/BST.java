/*
Given a Binary Search Tree that contains unique positive integer values greater than 0. The task is to complete the function isDeadEnd
which returns true if the BST contains a dead end else returns false. Here Dead End means a leaf node, at which no other node can be inserted.

Example 1:

Input :   
               8
             /   \ 
           5      9
         /  \     
        2    7 
       /
      1     
          
Output : 
Yes
Explanation : 
Node 1 is a Dead End in the given BST.
Example 2:

Input :     
              8
            /   \ 
           7     10
         /      /   \
        2      9     13

Output : 
Yes
*/

//Code
class BST
{
    public static boolean isDeadEnd(Node root)
    {
         return rahee(root,1,Integer.MAX_VALUE);
    }
      public static boolean rahee(Node root, int min,int max)
    {
        if(root == null)
        return false;
        if(min == max)
        return true;
        
        return rahee(root.left,min,root.data - 1) || rahee(root.right,root.data + 1,max);
}
Node 9 is a Dead End in the given BST.
