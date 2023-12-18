/*
Given an array a[ ] of N elements. Consider array as a circular array i.e. element after an is a1.The task is to find maximum sum of the 
absolute difference between consecutive elements with rearrangement of array elements allowed i.e.after any rearrangement of array
elements find |a1 – a2| + |a2 – a3| + …… + |an-1 – an| + |an – a1|.

Example 1:
        N = 4, K = 6
        arr[] = {1, 5, 7, 1}
        Output: 2
        Explanation: 
        arr[0] + arr[1] = 1 + 5 = 6 
        and arr[1] + arr[3] = 5 + 1 = 6.

Example 2:
        Input:
        N = 4, K = 2
        arr[] = {1, 1, 1, 1}
        Output: 6
        Explanation: 
        Each 1 will produce sum 2 with any 1.
*/
class MaximumSum
{
    long maxSum(long arr[] ,int n)
    {
    
        Arrays.sort(arr);
        int b = 0;
        int l = n-1;
        long sum = 0;
        while(b<=l){
            sum+=Math.abs(arr[b]-arr[l]);
            b++;
            l--;
        }
        return 2*sum;
    }
}
//Time Complexity = O(N).
