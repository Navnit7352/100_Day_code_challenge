/*
Given an array arr[] of N elements and a number K., split the given array into K subarrays such that the maximum subarray sum achievable
out of K subarrays formed is minimum possible. Find that possible subarray sum.

Example 1:

Input:
N = 4, K = 3
arr[] = {1, 2, 3, 4}
Output: 4
Explanation:
Optimal Split is {1, 2}, {3}, {4}.
Maximum sum of all subarrays is 4,
which is minimum possible for 3 splits. 
Example 2:

Input:
N = 3, K = 2
A[] = {1, 1, 2}
Output:
2
Explanation:
Splitting the array as {1,1} and {2} is optimal.
This results in a maximum sum subarray of 2.
*/

//Code
class Solution {
    static int splitArray(int[] arr , int N, int K) {
        int totalSum =0,max=Integer.MIN_VALUE;
        for(int a : arr) {
            totalSum+=a;
            max = Math.max(max,a);
        }
        
        int lo=max,hi=totalSum,ans=Integer.MAX_VALUE;
        while(lo<=hi) {
            int mid = lo+(hi-lo)/2;
            if(isValid(arr,mid,K)) {
                ans=Math.min(ans,mid);
                hi=mid-1;   
            } else {
                lo=mid+1;   
            }
        }
        return ans;
    }
     public static boolean isValid(int[] arr,int requiredSum,int k) {
        int sum=0,count=1;
        for(int a : arr) {
            if(sum+a<=requiredSum) {
                sum+=a;
            } else {
                sum=a;
                count++;
            }
        }
        return count<=k;
    }
};
