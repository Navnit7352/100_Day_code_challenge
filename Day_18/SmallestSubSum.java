/*
 Given an array of integers (A[])  and a number x, find the smallest subarray with sum greater than the given value. If such a subarray do not exist return 0 in that case.

Example 1:
        Input:
        A[] = {1, 4, 45, 6, 0, 19}
        x  =  51
        Output: 3
        Explanation:
        Minimum length subarray is 
        {4, 45, 6}

Example 2:
        Input:
        A[] = {1, 10, 5, 2, 7}
        x  = 9
        Output: 1
        Explanation:
        Minimum length subarray is {10}
 */
class SmallestSubSum {

    public static int smallestSubWithSum(int a[], int n, int x) {
        // Your code goes here 
        int ans=0;
        int sum=0;
        int maxSum=0;
        
        int start=0;
        
        int minLength = n+1;
        
        for(int i=0;i<n;i++){
            
            sum+=a[i];
            
            if(sum>x){  
            
            while(sum>x){
                sum-=a[start++];
            }
            minLength = Math.min(minLength,i-start+2);
            
            } 
        }
        return minLength ==n+1?0:minLength;
    }
}
//Time Complexity = O(N^2).
