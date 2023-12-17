/*
Given an array of integers, sort the array (in descending order) according to count of set bits in binary representation of array elements. 

Note: For integers having same number of set bits in their binary representation, sort according to their position in the original array i.e., a stable sort.

Example 1:
        Input: 
        arr[] = {5, 2, 3, 9, 4, 6, 7, 15, 32};
        Output:
        15 7 5 3 9 6 2 4 32
        Explanation:
        The integers in their binary
        representation are:
        15 - 1111
        7  - 0111
        5  - 0101
        3  - 0011
        9  - 1001
        6  - 0110
        2  - 0010
        4  - 0100
        32 - 10000
        hence the non-increasing sorted order is:
        {15}, {7}, {5, 3, 9, 6}, {2, 4, 32}
 
Example 2:
        Input: 
        arr[] = {1, 2, 3, 4, 5, 6};
        Output: 
        3 5 6 1 2 4
        Explanation:
        3  - 0011
        5  - 0101
        6  - 0110
        1  - 0001
        2  - 0010
        4  - 0100
        hence the non-increasing sorted order is
        {3, 5, 6}, {1, 2, 4}
*/

class BitCount
{ 
    static void sortBySetBitCount(Integer arr[], int n)
    { 
         Arrays.sort(arr, new MyComparator());
    } 
}
class MyComparator implements Comparator<Integer>
{
   @Override 
   public int compare(Integer i1, Integer i2)
    {
        int count1 = 0;
        while (i1 > 0)
        {
            count1 += i1 & 1;
            i1 = i1 >> 1;
        }
        int count2 = 0;
        
        while (i2 > 0)
        {
            count2 += i2 & 1;
            i2 = i2 >> 1;
        }
        
        return count2 - count1;
    }
}

//Time Complexity = O(1)
