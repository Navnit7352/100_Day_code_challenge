/*
 Given an array of N strings, find the longest common prefix among all strings present in the array.

Example 1:

        Input:
        N = 4
        arr[] = {geeksforgeeks, geeks, geek,
                geezer}
        Output: gee
        Explanation: "gee" is the longest common
        prefix in all the given strings.

Example 2:
        Input: 
        N = 2
        arr[] = {hello, world}
        Output: -1
        Explanation: There's no common prefix
        in the given strings.
 */
class LongestCommonPrefix{
    String longestCommonPrefix(String arr[], int n){
        String prefix = arr[0];
        
        for(int i = 1; i < n; i++){
            while(arr[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        
        if(prefix.length() == 0){
            return "-1";
        }
        return prefix;
    }
}
//Time Complexity = O(N).
