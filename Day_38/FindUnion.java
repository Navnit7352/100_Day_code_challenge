/*
Given two arrays a[] and b[] of size n and m respectively. The task is to find the number of elements in the union between these two arrays.

Union of the two arrays can be defined as the set containing distinct elements from both the arrays. If there are repetitions, 
then only one occurrence of element should be printed in the union.

Note : Elements are not necessarily distinct.

Example 1:
    Input:
    5 3
    1 2 3 4 5
    1 2 3
    Output: 
    5
    Explanation: 
    1, 2, 3, 4 and 5 are the
    elements which comes in the union set
    of both arrays. So count is 5.

Example 2:
    Input:
    6 2 
    85 25 1 32 54 6
    85 2 
    Output: 
    7
    Explanation: 
    85, 25, 1, 32, 54, 6, and
    2 are the elements which comes in the
    union set of both arrays. So count is 7.
*/

class FindUnion{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        int len1 = a.length,  len2 = b.length;
        HashSet<Integer> hs = new HashSet<Integer>(len1+len2);
        for(int i=0;i<len1;i++){
            hs.add(a[i]);
        }
        for(int i=0;i<len2;i++){
            hs.add(b[i]);
        }
        int result = hs.size();
        return result;
    }
}
//Time Complexity = O(N).
