/*
Given a string s, check if it is possible to convert it into a string that is the repetition of a substring of length k.
Conversion has to be done by following the steps mentioned below only once:

Select two indices i and j (zero-based indexing, i could be equal to j), such that i and j are divisible by k.
Select substrings of length k starting from indices i and j.
Replace substring starting at index i with substring starting at index j within the string
Note: You have to convert the string using the operation only once.

Example 1:

Input:
N = 4
K = 2
S = "bdac"
Output: 1
Explanation: We can replace either
"bd" with "ac" or "ac" with "bd"
Example 2:

Input: 
N = 5
K = 2
S = "abcde"
Output: 0
Explanation: Since n % k != 0, it's not 
possible to convert s into a string which
is a concatanation of a substring with 
length k.
*/

//Code 
class Solution
{
    int kSubstrConcat(int n, String s, int k)
    {
        if(n % k != 0) return 0;
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<=n-k;i+=k){
            String tmp = s.substring(i,i+k);
            map.put(tmp,map.getOrDefault(tmp,0)+1);
            if(map.size() > 2) return 0;
        }
        int cnt = 0;
        for( int it : map.values()){
            if(it > 1) cnt++;
        }
        return cnt >= 2 ? 0 : 1;
    }
}
