/*
Given a Integer array A[] of n elements. Your task is to complete the function PalinArray.
Which will return 1 if all the elements of the Array are palindrome otherwise it will return 0.

Example 1:

        Input:
        5
        111 222 333 444 555
        
        Output:
        1
        
        Explanation:
        A[0] = 111 //which is a palindrome number.
        A[1] = 222 //which is a palindrome number.
        A[2] = 333 //which is a palindrome number.
        A[3] = 444 //which is a palindrome number.
        A[4] = 555 //which is a palindrome number.
        As all numbers are palindrome so This will return 1.
        
Example 2:

        Input:
        3
        121 131 20
         
        Output:
        0
        
        Explanation:
        20 is not a palindrome hence the output is 0.
*/

//Code

class Palindrome
{
	public static int palinArray(int[] a, int n)
    {
        //forEach loop taking each value of the array
        for(int i:a){
            int o  = i;
            int reversed = 0;
            while(i>0){
                reversed = i + reversed;
            }
            if(o == reversed){
                return 1;
            }
           }
       return 0;
    }
}
//Time complexity = O(N^2)
