/*
Given a boolean matrix of size RxC where each cell contains either 0 or 1, find the row numbers (0-based) of row which already exists or are repeated.

Example 1:

Input:
R = 2, C = 2
matrix[][] = {{1, 0},
            {1, 0}}
Output: 
1
Explanation:
Row 1 is duplicate of Row 0.
Example 2:

Input:
R = 4, C = 3
matrix[][] = {{ 1, 0, 0},
            { 1, 0, 0},
            { 0, 0, 0},
            { 0, 0, 0}}
Output: 
1 3 
Explanation:
Row 1 and Row 3 are duplicates of Row 0 and 2 respectively. 
*/

//Code
  class Solution
{
    public static ArrayList<Integer> repeatedRows(int matrix[][], int m, int n)
    {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<String, Integer> hmap = new HashMap<>();

        for (int i = 0; i < m; i++) {
            String rowKey = Arrays.toString(matrix[i]);
            if (hmap.containsKey(rowKey)) {
                list.add(i);
            }
            hmap.put(rowKey, i);
        }
        return list;
    }
}
