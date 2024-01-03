/*
Given an array a of length n and a number k, find the largest sum of the subarray containing at least k numbers. It is guaranteed that the size of array is at-least k.

Example 1:

Input : 
n = 4
a[] = {1, -2, 2, -3}
k = 2
Output : 
1
Explanation :
The sub-array of length at-least 2
that produces greatest sum is {1, -2, 2}
Example 2:
Input :
n = 6 
a[] = {1, 1, 1, 1, 1, 1}
k = 2
Output : 
6
Explanation :
The sub-array of length at-least 2
that produces greatest sum is {1, 1, 1, 1, 1, 1}
*/

//Code

class Solution {
    
    public long maxSumWithK(long a[], long n, long k)
    {
        long cursum=0;
     
        for (int i=0;i<k;i++){
            cursum+=a[i];
        }
        
        if (n==k){
            return cursum;
        }
        
        long max=cursum;
        long initial=0;
        
        for (int i=(int)k;i<n;i++){
            cursum+=a[i];
            cursum-=a[i-(int)k];
            initial+=a[i-(int)k];
            
            if (initial>=0){
                max=Math.max(cursum+initial,max);
            }
            else{
                max=Math.max(max,cursum);
                initial=0;
            }
        }
        return max;
    }
}
