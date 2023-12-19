/*
Given a length n, count the number of strings of length n that can be made using a, b and c with at-most one b and two c allowed.

Example 1:
    Input: n = 1
    Output: 3
    Explanation: Possible strings are: "a",
    "b" and "c"

    
Example 2:

    Input: n = 3
    Output: 19
    Explanation: Number of strings with 3 
    occurrances of a: 1
    2-a and 1-b: 3
    2-a and 1-c: 3
    1-a, 1-b and 1-c: 6
    1-a and 2-c: 3
    1-b and 2-c: 3
    So, total number of strings of length 3
    is 1 + 3 + 3 + 6 + 3 + 3 = 19
*/

//Code 
class Solution 
{ 
    static long countStr(long n)
	{
	     return ((n*n*n + 3*n + 2)/2);
	}
} 
//Time Complexity = O(1)
