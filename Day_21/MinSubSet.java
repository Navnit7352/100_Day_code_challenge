/*
You are given an array Arr of size N containing non-negative integers. Your task is to choose the
minimum number of elements such that their sum should be greater than the sum of the rest of the
elements of the array.

Example 1:
        Input:
        N = 4 
        Arr[] = {2, 17, 7, 3}
        Output:
        1
        Explanation:
        If we only select element 17, the sum of the
        rest of the elements will be (2+3+7)=12.
        So the answer will be 1.

Example 2:
        Input:
        N = 4
        Arr = {20, 12, 18, 4}
        Output:
        2
        Explanation:
        If we select 12 and 18 from the array,
        the sum will be (12+18) = 30 and the sum of
        the rest of the elements will be (20+4) = 24.
        So, the answer will be 2. We can also
        select 20 and 18 as well.
 */
//Code
class MinSubset { 
    int minSubset(int[] Arr,int N) { 
          Arrays.sort(Arr);
        long ans=0;
        for(int i=0;i<N;i++) ans+=Arr[i];
        
        int c=0; long dum=0;
        for(int j=N-1;j>0;j--) {ans-=Arr[j];
        dum+=Arr[j];
        c++;
            if(dum>ans) return c; 
        }
        return 1;
    }
}
//Time Complexity = O(N*logN).
