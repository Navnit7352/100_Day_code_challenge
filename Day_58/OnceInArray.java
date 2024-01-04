/*
Given an array of integers arr[] of length N, every element appears thrice except for one which occurs once.
Find that element which occurs once.

Example 1:

Input:
N = 4
arr[] = {1, 10, 1, 1}
Output:
10
Explanation:
10 occurs once in the array while the other
element 1 occurs thrice.
Example 2:

Input:
N = 10
arr[] = {3, 2, 1, 34, 34, 1, 2, 34, 2, 1}
Output:
3
Explanation:
All elements except 3 occurs thrice in the array.
*/

//Code
class Solution {
    static int singleElement(int[] arr, int N) {
        int ones = 0, twos = 0;
        int commonBitMask;

        for (int i = 0; i < N; i++) {
            twos |= (ones & arr[i]);
            ones ^= arr[i];
            commonBitMask = ~(ones & twos);
            ones &= commonBitMask;
            twos &= commonBitMask;
        }

        return ones;
    }
}
