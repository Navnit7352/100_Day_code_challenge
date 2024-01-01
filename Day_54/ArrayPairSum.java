/*
Given an array of integers nums and a number k, write a function that returns true if given array can be divided into pairs such that sum of every pair is divisible by k.

Example 1 :

Input : 
nums = [9, 5, 7, 3]
k = 6
Output: 
True
Explanation: 
{(9, 3), (5, 7)} is a 
possible solution. 9 + 3 = 12 is divisible
by 6 and 7 + 5 = 12 is also divisible by 6.
Example 2:

Input : 
nums = [4, 4, 4]
k = 4
Output: 
False
Explanation: 
You can make 1 pair at max, leaving a single 4 unpaired.
*/

//Code
class Solution {
    public boolean canPair(int[] nums, int k) {
        if (nums.length % 2 == 1)
            return false;

        Map<Integer, Integer> remainderFrequency = new HashMap<>();

        for (int num : nums) {
            int remainder = (num % k + k) % k; 
            remainderFrequency.put(remainder, remainderFrequency.getOrDefault(remainder, 0) + 1);
        }

        for (int num : nums) {
            int remainder = (num % k + k) % k; 

            if (remainder == 0) {
                if (remainderFrequency.getOrDefault(0, 0) % 2 == 1)
                    return false;
            }
            else if (remainderFrequency.getOrDefault(remainder, 0) != remainderFrequency.getOrDefault(k - remainder, 0))
                return false;
        }

        return true;
    }
}
