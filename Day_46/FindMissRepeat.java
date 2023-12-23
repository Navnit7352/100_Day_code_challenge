/*
Given an unsorted array Arr of size N of positive integers. One number 'A' from set {1, 2,....,N} 
is missing and one number 'B' occurs twice in array. Find these two numbers.

Example 1:
    Input:
    N = 2
    Arr[] = {2, 2}
    Output: 2 1
    Explanation: Repeating number is 2 and 
    smallest positive missing number is 1.

Example 2:
      Input:
      N = 3
      Arr[] = {1, 3, 3}
      Output: 3 2
      Explanation: Repeating number is 3 and 
      smallest positive missing number is 2.
*/

//Code
class Solve {
    int[] findTwoElement(int arr[], int n) {
        int r=-1;
        long s=0;
        for(int i=0;i<n;i++)
           s+=arr[i];
        for(int i=0;i<n;i++)
        {
            int t=Math.abs(arr[i]);
            if(arr[t-1]<0)
            {
                r=t;
                break;
            }
            else
            {
                arr[t-1]=arr[t-1]*(-1);
            }
        }
        long m;
        if(n%2==0)
        {
            m=(n/2)*(n+1);
        }       
        else
           m=((n+1)/2)*n;
        long p=m-s+r;
        return new int[]{r,(int)(p)};
    }
}
//Time Complexity = O(N).
