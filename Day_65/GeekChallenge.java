/*
GeeksforGeeks has introduced a special offer where you can enroll in any course, and if you manage to complete 90% 
of the course within 90 days, you will receive a refund of 90%.

Geek was fascinated by this offer. This offer was valid for only n days, and each day a new course was available for purchase. 
Geek decided that if he bought a course on some day, he will complete that course on the same day itself and redeem floor
[90% of cost of the course] amount back. Find the maximum number of courses that Geek can complete in those n days if he had total amount initially.

Note: On any day, Geek can only buy the new course that was made available for purchase that day.

Example 1:

Input:
n = 2
total = 10
cost = [10, 9]
Output: 2
Explanation: 
Geek can buy the first course for 10 amount, 
complete it on the same date and redeem 9 back. 
Next, he can buy and complete the 2nd course too.
Example 2:

Input:
n = 11
total = 10
cost = [10, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1]
Output: 10
Explanation: 
Geek can buy and complete all the courses that cost 1.
*/

//Code
class Solution {
    int dp[][];
    public int max_courses(int n, int total, int[] cost) {
        dp = new int[n+1][total+1];
         for(int i=n-1;i>=0;i--){
             for(int t=0;t<=total;t++){ 
                 dp[i][t]=0+dp[i+1][t];
                 if(cost[i]<=t){
                    dp[i][t]=Math.max(dp[i+1][t],
                    1+dp[i+1][t-cost[i]+((int)Math.floor(0.9*cost[i]))]);
                }
             }
         }
         return dp[0][total];
    }
         int rec(int i, int t, int A[]){
        if(i>=A.length || t<=0) return 0;
        if(dp[i][t]!=-1) return dp[i][t];
        int nt=0+rec(i+1,t,A);
        if(A[i]<=t){
            nt=Math.max(nt,1+rec(i+1,t-A[i]+((int)Math.floor(0.9*A[i])),A));
        }return dp[i][t]=nt;
    
    }
}
