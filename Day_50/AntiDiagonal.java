/*
Give a N*N square matrix, return an array of its anti-diagonals in top-leftmost to bottom-rightmost order. In an element of a anti-diagonal (i, j), surrounding elements will be (i+1, j-1) and (i-1, j+1). Look at the examples for more clarity.

Example 1:

Input:
N = 2
matrix[][] = 1 2
            3 4
Output:
1 2 3 4
Explanation:
List of anti-diagnoals in order is
{1}, {2, 3}, {4}
Example 2:

Input:
N = 3
matrix[][] = 3 2 3
            4 5 1
            7 8 9
Output:
3 2 4 3 5 7 1 8 9
Explanation:
List of anti-diagnoals in order is
{3}, {2, 4}, {3, 5, 7}, {1, 8}, {9}
*/
class Solution
{
    public int[] antiDiagonalPattern(int[][] matrix)
    {
         int n=matrix.length;
        int[] arr=new int[n*n];
        int ct=0;
        int i=0;
        int j=0;
        int ct1=0;
        while(ct<n*n){
            if(i<n && i>=0 && j<n && j>=0){
                arr[ct++]=matrix[i][j];
                i++;
                j--;
                ct1++;
            }else if(j<0 && i<n){
                i-=ct1;
                j+=(ct1+1);
                ct1=0;
            }else{
                i-=(ct1-1);
                j+=(ct1);
                ct1=0;
            }
        }
        return arr;

    }
}
