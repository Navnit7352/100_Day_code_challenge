/*
Given two strings 'str1' and 'str2', check if these two strings are isomorphic to each other.

If the characters in str1 can be changed to get str2, then two strings, str1 and str2, are isomorphic. A character must be completely swapped
out for another character while maintaining the order of the characters. A character may map to itself, but no two characters may map to the same character.

Example 1:
    Input:
    str1 = aab
    str2 = xxy
    Output: 
    1
    Explanation: 
    There are two different characters in aab and xxy, i.e a and b with frequency 2 and 1 respectively.

Example 2:
    Input:
    str1 = aab
    str2 = xyz
    Output: 
    0
    Explanation: 
    There are two different characters in aab but there are three different charactersin xyz. So there won't be one to one mapping between str1 and str2.
*/

//Code

class IsomorphicStrig
{
    //Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String str1,String str2)
    {
         if (str1.length() != str2.length()) {
            return false;
        }

        Map<Character, Character> mapping = new HashMap<>();
        Set<Character> visited = new HashSet<>();

        for (int i = 0; i < str1.length(); i++) {
            char char1 = str1.charAt(i);
            char char2 = str2.charAt(i);

            if (mapping.containsKey(char1)) {
                if (mapping.get(char1) != char2) {
                    return false;
                }
            } else {
                if (visited.contains(char2)) {
                    return false;
                }
                mapping.put(char1, char2);
                visited.add(char2);
            }
        }

        return true;
    }

}

//Time Complexity = O(n)
