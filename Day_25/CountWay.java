/*
Given a fence with n posts and k colors, find out the number of ways of painting the fence so 
that not more than two consecutive posts have the same colors. Since the answer can be large 
return it modulo 109 + 7.

Example 1:
        Input:
        n = 3
        k = 2 
        Output: 6
        Explanation: 
        We have following possible combinations:

Example 2:
        Input:
        n = 2
        k = 4 
        Output: 16
        Explanation: 
        After coloring first post with
        4 possible combinations, you can still color
        next posts with all 4 colors. Total possible 
        combinations will be 4x4=16
*/
class CountWay
{
    long countWays(int n,int k)
    {
         if(n == 1)
            return k;
            
        long mod = (long) 1e9 + 7, same = 0, diff = k;
        
        for(int i = 2; i <= n; i++) 
        {
            long prev = same;
            same = diff;
            diff = ((prev + same) * (k - 1)) % mod;
        }
        
        return (same + diff) % mod;
    }
}
//Time Complexity = O(N)
