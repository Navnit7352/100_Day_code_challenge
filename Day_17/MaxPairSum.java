/*
Given an array of integers, arr[] and a number, K.You can pair two numbers of the array if the difference between them isstrictly less 
than K. The task is to find the maximum possible sum of such disjoint pairs (i.e., each element of the array can beused at most once).
The Sum of P pairs is the sum of all 2P elements of pairs.

Example 1:
        Input  : 
        arr[] = {3, 5, 10, 15, 17, 12, 9}
        K = 4
        Output : 
        62
        Explanation :
        Then disjoint pairs with difference less
        than K are, (3, 5), (10, 12), (15, 17)
        max sum which we can get is 
        3 + 5 + 10 + 12 + 15 + 17 = 62
        Note that an alternate way to form 
        disjoint pairs is,(3, 5), (9, 12), (15, 17)
        but this pairing produces less sum.
 
Example 2:
        Input  : 
        arr[] = {5, 15, 10, 300}
        K = 12
        Output : 
        25
*/
class MaxPairSum { 
    public static int maxSumPairWithDifferenceLessThanK(int arr[], int N, int K) 
    {
        Arrays.sort(arr); 
        int dp[] = new int[N];
        Arrays.fill(dp,-1);
        int ans=0;
        for(int i=N-1; i>=0; i--){
            if(dp[i]==-1){
                for(int j=i-1; j>=0; j--){
                if(arr[i]-arr[j]<K){
                    if(dp[j]==-1){
                        ans+=arr[i]+arr[j];
                        dp[j] = arr[i]+arr[j];
                        break;
                    }
                }
            }
            }
        }
        return ans;
    }
    
}
//Time Complexity = O(n*logn).
