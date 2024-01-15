/*
Given a non-negative integer S represented as a string, remove K digits from the number so that the new number is the smallest possible.
Note : The given num does not contain any leading zero.

Example 1:

Input:
S = "149811", K = 3
Output: 
111
Explanation: 
Remove the three digits 
4, 9, and 8 to form the new number 111
which is smallest.
Example 2:

Input:
S = "1002991", K = 3
Output: 
21
Explanation: 
Remove the three digits 1(leading
one), 9, and 9 to form the new number 21(Note
that the output must not contain leading
zeroes) which is the smallest.
*/

//Code
lass Solution {
    public String removeKdigits(String S, int K) {
        StringBuilder sb = new StringBuilder(S);
        int i = 0;

        while (K > 0 && i < sb.length() - 1) {
            if (sb.charAt(i) > sb.charAt(i + 1)) {
                sb.deleteCharAt(i);
                K--;
                if (i > 0) {
                    i--; // Backtrack to potentially remove more digits
                }
            } else {
                i++;
            }
        }

        // Remove any remaining digits from the end
        while (K > 0 && sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
            K--;
        }

        // Remove leading zeros
        int start = 0;
        while (start < sb.length() && sb.charAt(start) == '0') {
            start++;
        }

        return start == sb.length() ? "0" : sb.substring(start);
    }
}
