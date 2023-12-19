/*
Given two numbers M and N. The task is to find the position of the rightmost different bit in the binary representation of numbers.
If both M and N are the same then return -1 in this case.

Example 1: 
    Input: 
    M = 11, N = 9
    Output: 
    2
    Explanation: 
    Binary representation of the given numbers are: 1011 and 1001, 2nd bit from right is different.

Example 2:
    Input: 
    M = 52, N = 4
    Output: 
    5
    Explanation: 
    Binary representation of the given numbers are: 110100 and 0100, 5th-bit from right is different.
*/

//Code
class Solution
{
    public static int posOfRightMostDiffBit(int m, int n)
    {
        if(m-n==0){
            return -1;
        }
        else{
            
            m=m-n;
            if(m<0){
                m=m*-1;
            }
            int k=1;
            while(m>0){
                if((m&1)==1){
                    return k;
                }
                k++;
                m=m>>1;
            }
        }
        return -1;     
    }
}
