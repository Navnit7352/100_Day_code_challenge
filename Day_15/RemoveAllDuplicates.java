/*
Given a string Str which may contains lowercase and uppercase chracters. The task is to remove all duplicate characters from the
string and find the resultant string. The order of remaining characters in the output should be same as in the original string.

Example 1:
        Input:
        Str = geeksforgeeks
        Output: geksfor
        Explanation: After removing duplicate
        characters such as e, k, g, s, we have
        string as "geksfor".
        
Example 2:
        Input:
        Str = HappyNewYear
        Output: HapyNewYr
        Explanation: After removing duplicate
        characters such as p, e, a, we have
        string as "HapyNewYr".
*/
class RemoveAllDuplicates {
    String removeDuplicates(String str) {
         List<Character> li = new ArrayList<Character>();
        for(int i=0;i<str.length();i++)
        {
            if(!li.contains(str.charAt(i)))
            li.add(str.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        
        for (Character ch : li) {
            sb.append(ch);
        }
        
        String string = sb.toString();
         return string;
    }
}
//Time Complexity = O(
