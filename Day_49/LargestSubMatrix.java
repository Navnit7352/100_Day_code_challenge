/*
Given a matrix mat[][] of size N x M. The task is to find the largest rectangular sub-matrix by area whose sum is 0.

If there are multiple solutions return the rectangle which starts from minimum column index. If you still have multiple solutions return the one having greatest row number. If no such matrix is present return a zero (0) size matrix.

Example 1:

Input: N = 3, M = 3
mat[][] =  1, 2, 3
          -3,-2,-1
           1, 7, 5

Output:  1, 2, 3
        -3,-2,-1

Explanation: This is the largest sub-matrix,
whose sum is 0.
Example 2:

Input: N = 4, M = 4
mat[][] = 9, 7, 16, 5
          1,-6,-7, 3
          1, 8, 7, 9
          7, -2, 0, 10

 Output: -6,-7
          8, 7
         -2, 0 
*/

//Code

class Solution {
    public static ArrayList<ArrayList<Integer>> sumZeroMatrix(int[][] a) {
        int n=a.length;
        int m=a[0].length;
        int[][] sum=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                sum[i][j]=a[i][j]+(j>0? sum[i][j-1]:0);
            }
        }
        int maxArea=0,startRow=0,endRow=-1,startCol=0,endCol=-1;
        for(int c1=0;c1<m;c1++){
            for(int c2=c1;c2<m;c2++){
                int[] temp=new int[n];
                for(int i=0;i<n;i++){
                    temp[i]=sum[i][c2]-(c1>0 ? sum[i][c1-1]:0);
                }
                Map<Integer,Integer>map=new HashMap();
                map.put(0,-1);
                int currSum=0;
                for(int i=0;i<n;i++){
                    currSum+=temp[i];
                    if(map.containsKey(currSum)){
                        int area=(c2-c1+1)*(i-map.get(currSum));
                        if(area>maxArea){
                            maxArea=area;
                            startRow=map.get(currSum)+1;
                            endRow=i;
                            startCol=c1;
                            endCol=c2;
                        }
                    }
                    else{
                        map.put(currSum,i);
                    }
                }
                
            }
        }
        ArrayList<ArrayList<Integer>> ans=new ArrayList();
        if(maxArea==0)
        return ans;
        for(int i=startRow;i<=endRow;i++){
            ArrayList<Integer> row=new ArrayList();
            for(int j=startCol;j<=endCol;j++){
                row.add(a[i][j]);
            }
            ans.add(row);
        }
        return ans;
    }
}
