/*
Given an array, rotate the array by one position in clock-wise direction.
 
Example 1:
        Input:
        N = 5
        A[] = {1, 2, 3, 4, 5}
        Output:
        5 1 2 3 4
 
Example 2:
        Input:
        N = 8
        A[] = {9, 8, 7, 6, 4, 2, 1, 3}
        Output:
        3 9 8 7 6 4 2 1
 

Your Task:  
        You don't need to read input or print anything. Your task is to complete the function rotate() which takes the array A[] and 
        its size N as inputs and modify the array in place.
*/

//Code
class RotateArray {
    public void rotate(int arr[], int n)
    {
        //storing last value of the array
        int x=arr[arr.length-1];
        //Shifting value in array by index
        for(int i=arr.length-1; i>0; i--){
            arr[i]=arr[i-1];
        }
        arr[0]=x;
    }
}
//Time Complexity = O(N)
