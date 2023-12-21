/*
Given a matrix(2D array) M of size N*N consisting of 0s and 1s only. The task is to find the column with maximum number of 0s. 
If more than one column exists, print the one which comes first. If the maximum number of 0s is 0 then return -1.

Example:
    Input:
    N = 3
    M[][] = {{0, 0, 0},
              {1, 0, 1},
              {0, 1, 1}}
    Output:
    0
    Explanation:
    0th column (0-based indexing) is having 2 zeros which is maximum among all columns and comes first.
*/

//Code
class PredictColumn
{
    int columnWithMaxZeros(int arr[][], int N)
    {
        int maxIndex=-1;
        int maxSum=0;
        
        
        for(int j=0;j<N;j++){
            int sum=0;
            for(int i=0;i<N;i++){
                if(arr[i][j]==0) sum++;
            }
            
            
            int temp=maxSum;
            maxSum=Math.max(maxSum,sum);
            
            if(maxSum!=temp) maxIndex=j;
        }
        
        
        if(maxIndex==-1) return -1;
        else return maxIndex;
    }
}

//Time Complexity = O(N).
