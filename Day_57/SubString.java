/*
Given a string S consisting of the characters 0, 1 and 2. Your task is to find the length of the smallest substring of string S that 
contains all the three characters 0, 1 and 2. If no such substring exists, then return -1.

Example 1:

Input:
S = 10212
Output:
3
Explanation:
The substring 102 is the smallest substring
that contains the characters 0, 1 and 2.
Example 2:

Input: 
S = 12121
Output:
-1
Explanation: 
As the character 0 is not present in the
string S, therefor no substring containing
all the three characters 0, 1 and 2
exists. Hence, the answer is -1 in this case.
*/

/Code
  class Solution {
    public int smallestSubstring(String S) {
      int z=0;int on=0;int tw=0;
        int ans=Integer.MAX_VALUE;
        int n=S.length();
        int s=0;
        char a[]=S.toCharArray();
        for(int i=0;i<n;i++){
            if(a[i]=='0'){
                z++;
            }
            if(a[i]=='1'){
                
            on++;
            }
            if(a[i]=='2'){
                tw++;
            }
            if(z>0&&on>0&&tw>0){
                
                while(z>0&&on>0&&tw>0){
                    ans=Math.min(i-s+1,ans);
                    if(a[s]=='0'){
                z--;
            }
            if(a[s]=='1'){
                
            on--;
            }
            if(a[s]=='2'){
                tw--;
            }
            s++;
                }
            }
          
        }
        if(ans==Integer.MAX_VALUE)return -1;
    
        return ans;
    }
};
