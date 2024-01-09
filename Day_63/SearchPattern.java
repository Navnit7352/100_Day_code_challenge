/*
Given two strings, one is a text string, txt and other is a pattern string, pat. The task is to print the indexes of
all the occurences of pattern string in the text string. Use one-based indexing while returing the indices. 
Note: Return an empty list incase of no occurences of pattern. Driver will print -1 in this case.

Example 1:

Input:
txt = "geeksforgeeks"
pat = "geek"
Output: 
1 9
Explanation: 
The string "geek" occurs twice in txt, one starts are index 1 and the other at index 9. 
Example 2:

Input: 
txt = "abesdu"
pat = "edu"
Output: 
-1
Explanation: 
There's not substring "edu" present in txt.
*/

//Code
class Solution
{
    
    ArrayList<Integer> search(String pat, String txt)
    {
         ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        while(true)
        {
          int index = txt.indexOf(pat, i);
          if(index == -1)
              break;
              
              else
              {
                  list.add(index + 1);
                  //index += pat.length() ;
                  i = index + 1;
              }
        }
        if(list.size() == 0) list.add(-1);
        
        return list;
    }
}
