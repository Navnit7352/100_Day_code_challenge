class Solution
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