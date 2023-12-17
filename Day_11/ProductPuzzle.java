/*
Given an array nums[] of size n, construct a Product Array P (of same size n) such that P[i] is equal to the product of all the elements of nums except nums[i].

 

Example 1:

Input:
n = 5
nums[] = {10, 3, 5, 6, 2}
Output:
180 600 360 300 900
Explanation: 
For i=0, P[i] = 3*5*6*2 = 180.
For i=1, P[i] = 10*5*6*2 = 600.
For i=2, P[i] = 10*3*6*2 = 360.
For i=3, P[i] = 10*3*5*2 = 300.
For i=4, P[i] = 10*3*5*6 = 900.
Example 2:

Input:
n = 2
nums[] = {12,0}
Output:
0 12

*/

class ProductPuzzle
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
        long product = 1;
        long arr[] = new long[n];
        int zeroCount = 0;
        int zeroIndex = -1;
        for(int i = 0; i<n; i++){
            if(nums[i] == 0){
                zeroCount++;
                zeroIndex = i;
            }else{
                product *= nums[i];
            }
        }
        if(zeroCount > 1) return arr;
        
        if(zeroCount == 0){
            for(int i = 0; i<n; i++){
                arr[i] = product/nums[i];
            }
        }else{
            arr[zeroIndex] = product;
        }
        return arr;
	} 
} 
//Time Complexity = O(N).
