/*
There is a road passing through a city with N plots on both sides of the road. Plots are arranged in a straight line on either side of the road.
Determine the total number of ways to construct buildings in these plots, ensuring that no two buildings are adjacent to each other. Specifically,
buildings on opposite sides of the road cannot be adjacent.

Using * to represent a plot and || for the road, the arrangement for N = 3 can be visualized as follows: * * * || * * *.

Note: As the answer can be very large, print it mod 109+7.

Example 1:

Input: N = 1
Output: 4
Explanation: 
Possible ways for the arrangement are B||*, *||B, B||B, *||*
where B represents a building.
Example 2:

Input: N = 3
Output: 25
Explanation: 
Possible ways for one side are BSS, BSB, SSS, SBS,
SSB where B represents a building and S
represents an empty space. Pairing up with 
possibilities on the other side of the road,
total possible ways are 25.
*/

//Code
class Solution
{
    public int TotalWays(int N)
    {
       long mod = 1000000007, a = 2, b = 3;
        if (N == 1)
            return 4;
    
        if (N == 2)
            return 9;
    
        for (int i = 3; i <= N; i++)
        {
            long c = (a + b) % mod;
            a = b;
            b = c;
        }
    
        return (int) ((b * b) % mod);
    }
}
