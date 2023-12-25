/*
Given a square matrix of size n*n. The task is to find the determinant of this matrix.

Example 1:

Input:
n = 4
matrix[][] = {{1, 0, 2, -1},
              {3, 0, 0, 5},
              {2, 1, 4, -3},
              {1, 0, 5, 0}}
Output: 30
Explanation:
Determinant of the given matrix is 30.
Example 2:

Input:
n = 3
matrix[][] = {{1, 2, 3},
              {4, 5, 6},
              {7, 10, 9}}
Output: 12
Explanation:
Determinant of the given matrix is 12.
*/

//Code

class Solution
{
    static int determinantOfMatrix(int matrix[][], int n)
    {
        if(n == 1) return matrix[0][0]; 
        if(n == 2){
            return (matrix[0][0]*matrix[1][1]) - (matrix[0][1]*matrix[1][0]);
        }
        int deter = 0;
        for(int i=0; i<n; i++){
            int[][] temp = new int[n-1][n-1];
            int r=0, c=0;
            for(int j=1; j<n; j++){
                for(int k=0; k<n; k++){
                    if(k==i) continue;
                    temp[r][c] = matrix[j][k];
                    c++;
                }
                r++;
                c=0;
            }
            if(i%2 == 0)
                deter += matrix[0][i] * determinantOfMatrix(temp, n-1);
            else
                deter -= matrix[0][i] * determinantOfMatrix(temp, n-1);
        }
        return deter;
    }
}
//Time Complexity = O(N^4).
