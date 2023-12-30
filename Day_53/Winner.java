/*
Given an array of n names arr of candidates in an election, where each name is a string of lowercase characters. 
A candidate name in the array represents a vote casted to the candidate. Print the name of the candidate that
received the maximum count of votes. If there is a draw between two candidates, then print lexicographically smaller name.

Example 1:

Input:
n = 13
arr[] = {john,johnny,jackie,johnny,john 
jackie,jamie,jamie,john,johnny,jamie,
johnny,john}
Output: john 4
Explanation: john has 4 votes casted for 
him, but so does johny. john is 
lexicographically smaller, so we print 
john and the votes he received.
Example 2:

Input:
n = 3
arr[] = {andy,blake,clark}
Output: andy 1
Explanation: All the candidates get 1 
votes each. We print andy as it is 
lexicographically smaller.
*/

//Code

class Solution
{
    public static String[] winner(String arr[], int n)
    {
         TreeMap<String, Integer> tm = new TreeMap<>();
        
        for(String str : arr)  tm.put(str, tm.getOrDefault(str, 0)+1);
        
        String winnerName = "";
        int winnerVotes = Integer.MIN_VALUE;
        for(String key : tm.keySet()){
            if(tm.get(key) > winnerVotes){
                winnerName = key;
                winnerVotes = tm.get(key);
            }
        }
        
        return new String[]{winnerName, String.valueOf(winnerVotes)};
    }
}
