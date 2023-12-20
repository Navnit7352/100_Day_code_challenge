/*
Given three arrays sorted in increasing order. Find the elements that are common in all three arrays.
Note: can you take care of the duplicates without using any additional Data Structure?

Example 1:

        Input:
        n1 = 6; A = {1, 5, 10, 20, 40, 80}
        n2 = 5; B = {6, 7, 20, 80, 100}
        n3 = 8; C = {3, 4, 15, 20, 30, 70, 80, 120}
        Output: 20 80
        Explanation: 20 and 80 are the only
        common elements in A, B and C.
*/


class CountDuplicate
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        ArrayList<Integer> result=new ArrayList<>();
        result.add(0);
        int x=0;
        for(int i=0; i<A.length; i++){
            for(int j=0; j<B.length; j++){
                if(A[i]==B[j] && A[i]!=result.get(x)){
                    for(int k=0; k<C.length; k++){
                        if(A[i]==C[k]){
                            result.add(A[i]);
                            x++;
                            break;
                        }
                    }
                }
            }
        }
        result.remove(0);
        return result;
    }
}
//Time Complexity = O(N^3).
