/*
Given a binary tree and an integer K. Find the number of paths in the tree which have their sum equal to K.
A path may start from any node and end at any node in the downward direction.

Example 1:

Input:      
Tree = 
          1                               
        /   \                          
       2     3
K = 3
Output: 
2
Explanation:
Path 1 : 1 + 2 = 3
Path 2 : only leaf node 3
Example 2:

Input: 
Tree = 
           1
        /     \
      3        -1
    /   \     /   \
   2     1   4     5                        
        /   / \     \                    
       1   1   2     6    
K = 5                    
Output: 
8
Explanation:
The following paths sum to K.  
3 2 
3 1 1 
1 3 1 
4 1 
1 -1 4 1 
-1 4 2 
5 
1 -1 5 
*/

//Code
class KpathBT
{
    int mod = 1000000007;
    int ans = 0;
    HashMap<Integer,Integer> mp = new HashMap<>(); 
  
    public void sumK_util(Node root, int sum, int cur)
    {
        
        if(root == null)
            return;
        
        //check if cur+root.data - sum exists in the HashMap
        //if yes, add its frequency to the answer
        ans = (ans + (mp.getOrDefault(cur + root.data - sum,0))%mod)%mod;
        
        if((cur + root.data) == sum)
            ans = (ans+1)%mod;
        
        mp.put(cur + root.data, (mp.getOrDefault(cur + root.data,0)+1)%mod);
        
        sumK_util(root.left, sum, cur+root.data);
        sumK_util(root.right, sum, cur+root.data);
        
        mp.put(cur + root.data, ((mp.getOrDefault(cur + root.data,0)-1) + mod)%mod);
    }
    public int sumK(Node root,int k)
    {
         sumK_util(root, k, 0);

        mp.clear();
        
        int temp = ans;
        ans = 0; //reset the answer variable
        
        //return the temporary variable as the final answer
        return temp;
    }
}
