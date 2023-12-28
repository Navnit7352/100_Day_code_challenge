/*
Given two strings wild and pattern. Determine if the given two strings can be matched given that, wild string may contain * and ? but string pattern will not. * and ? can be converted to another character according to the following rules:

* --> This character in string wild can be replaced by any sequence of characters, it can also be replaced by an empty string.
? --> This character in string wild can be replaced by any one character.
Example 1:

Input: 
wild = ge*ks
pattern = geeks
Output: Yes
Explanation: Replace the '*' in wild string 
with 'e' to obtain pattern "geeks".
Example 2:

Input: 
wild = ge?ks*
pattern = geeksforgeeks
Output: Yes
Explanation: Replace '?' and '*' in wild string with
'e' and 'forgeeks' respectively to obtain pattern 
"geeksforgeeks"
*/

//Code
class Solution{
    static Boolean dp[][];
    static boolean rec(int pi,int wi,String p,String w){
        if(dp[pi][wi]!=null) return dp[pi][wi];
        boolean b=false;
        if(pi==p.length() && wi==w.length()) b=true;
        else if(wi==w.length()) b=false;
        else if(pi==p.length()) b=w.charAt(wi)=='*' && rec(pi,wi+1,p,w);
        else if(p.charAt(pi)==w.charAt(wi)||w.charAt(wi)=='?') b=rec(pi+1,wi+1,p,w);
        else if(w.charAt(wi)=='*') b=rec(pi+1,wi,p,w)||rec(pi,wi+1,p,w);
        return dp[pi][wi]=b;
    }
    static boolean match(String wild, String pattern)
    {
        int n=wild.length(),m=pattern.length();
        dp=new Boolean[m+1][n+1];
        return rec(0,0,pattern,wild);
    }
}
