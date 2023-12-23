/*
Given an array arr of size N and an element k. The task is to find the count of elements in 
the array that appear more than n/k times.

Example 1:
        Input:
        N = 8
        arr = [3,1,2,2,1,2,3,3]
        k = 4
        Output: 
        2
        Explanation: 
        In the given array, 3 and 2 are the only elements that appears more than n/k times.
        
Example 2:
        Input:
        N = 4
        arr = [2,3,3,2]
        k = 3
        Output: 
        2
        Explanation: In the given array, 3 and 2 are the only elements that appears more than n/k
        times. So the count of elements are 2.
*/
class Solution 
{

    public int countOccurence(int[] arr, int n, int k) 
    {
        Map<Integer,Integer> map = new HashMap<>();
        
        int val = n/k;
        int count=0;
        for(int i=0;i<n;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        
        for(Map.Entry<Integer,Integer> temp : map.entrySet())
        {
            if(temp.getValue()>val)
            count++;
        }
        
        return count;
    }
}
//Time Complexity =  O(N).
