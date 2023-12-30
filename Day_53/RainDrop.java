/*
Given an array arr[] of N non-negative integers representing the height of blocks. If width of each block is 1, compute how much water can be trapped between the blocks during the rainy season. 
 

Example 1:

Input:
N = 6
arr[] = {3,0,0,2,0,4}
Output:
10
Explanation: 

Example 2:

Input:
N = 4
arr[] = {7,4,0,9}
Output:
10
Explanation:
Water trapped by above 
block of height 4 is 3 units and above 
block of height 0 is 7 units. So, the 
total unit of water trapped is 10 units.
Example 3:

Input:
N = 3
arr[] = {6,9,9}
Output:
0
Explanation:
No water will be trapped.

*/

//Code
class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) { 
        int leftmax []=new int [n];
        leftmax[0]=arr[0];
        for(int i=1;i<n;i++)
            leftmax[i]=Math.max(arr[i],leftmax[i-1]);
        
        int rightmax []=new int[n];
        rightmax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--)
            rightmax[i]=Math.max(arr[i], rightmax[i+1]);
                                                          
        long trappedWater=0;
        
        for(int i=0;i<n;i++){
            int waterLevel=Math.min(leftmax[i],rightmax[i]);
            trappedWater +=waterLevel-arr[i];
        }
        return trappedWater;
    } 
}
