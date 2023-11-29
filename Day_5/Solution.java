class Solution
{
    //Function to check if a string can be obtained by rotating
    //another string by exactly 2 places.
    public static boolean isRotated(String str1, String str2)
    {
        if (str1.length() != str2.length()) {
            return false;
        }
        int len = str1.length();
        if (len < 2) {
            return str1.equals(str2);
        }
        String clockwiseRotation = str1.substring(len - 2) + str1.substring(0, len - 2);
        String anticlockwiseRotation = str1.substring(2) + str1.substring(0, 2);
        return str2.equals(clockwiseRotation) || str2.equals(anticlockwiseRotation);
    }
    
}