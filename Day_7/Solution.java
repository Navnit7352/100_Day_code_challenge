class Solution
{
    //Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String s1, String s2 )
    {
         if (s1.length() != s2.length()) {
            return false;
        }

        // Concatenate the first string with itself
        String temp = s1 + s1;

        // Check if the second string is a substring of the concatenated string
        return temp.contains(s2);
    }
    
}