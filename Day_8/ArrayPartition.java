/*
Given an array of size n and a range [a, b]. The task is to partition the array around the range such that array is divided into three parts.
1) All elements smaller than a come first.
2) All elements in range a to b come next.
3) All elements greater than b appear in the end.
The individual elements of three sets can appear in any order. You are required to return the modified array.

Note: The generated output is 1 if you modify the given array successfully.


Example 1:
        Input: 
        n = 5
        A[] = {1, 2, 3, 3, 4}
        [a, b] = [1, 2]
        Output: 1
        Explanation: One possible arrangement is:
        {1, 2, 3, 3, 4}. If you return a valid
        arrangement, output will be 1.
        
Example 2:
        Input: 
        n = 3 
        A[] = {1, 4, 3, 6, 2, 1}
        [a, b] = [1, 3]
        Output: 1
        Explanation: One possible arrangement 
        is: {1, 3, 2, 1, 4, 6}. If you return a valid
        arrangement, output will be 1.
*/

//Code
class ArrayPartition{
    public void threeWayPartition(int array[], int a, int b)
    {
        int smaller=0;
        int between=0;
        int larger=array.length-1;
        while(between<=larger){
            if(array[between]<a){
                swap(array,smaller,between);
                smaller++;
                between++;
            }
            else if(array[between]>=a && array[between]<=b) between++;
            else{
                swap(array,larger,between);
                larger--;
            }
        }
    }
    
    public void swap(int array[], int a, int b){
        int temp=array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
///Time Complexity = O(N)
