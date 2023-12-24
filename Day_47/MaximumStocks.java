/*
In a stock market, there is a product with its infinite stocks. The stock prices are given for N days, where price[i] denotes the price of the stock on the ith day.
There is a rule that a customer can buy at most i stock on the ith day.
If the customer has an amount of k amount of money initially. The task is to find out the maximum number of stocks a customer can buy. 

Example 1:
    Input:
    price = [10,7,19]
    k = 45
    Output: 
    4
    Explanation: 
    A customer purchases 1 stock on day 1, 2 stocks on day 2 and 1 stock on day 3 for 10, 7 * 2 = 14 and 
    19 respectively. Hence, total amount is 10 + 14 + 19 = 43 and number of stocks purchased is 4.
    
Example 2:
    Input: 
    price = [7,10,4]
    k = 100
    Output: 
    6
    Explanation:
    Buy on all 3 days.
*/
class Solution {
    public static int buyMaximumProducts(int n, int k, int[] price) {
         int[][] arr = new int[n][2];
        
        for(int i = 0; i < n; i++) {
            arr[i][0] = i+1;
            arr[i][1] = price[i];
        }
        arrSort(arr, 1);
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i][1]*arr[i][0] < k) {
                count += arr[i][0];
                k -= arr[i][1]*arr[i][0];
            }else{
                int leastShares = k / arr[i][1];
                k -= arr[i][1]*leastShares;
                count += leastShares;
                break;
            }
        }
        
        return count;
    }
    public static void arrSort(int[][] arr, int col) {
        Arrays.sort(arr, (a, b) -> Integer.compare(a[col],b[col]));
    }
}
//Time complexity = O(nlogn)
