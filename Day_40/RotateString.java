/*
Given two strings a and b. The task is to find if the string 'b' can be obtained by rotating (in any direction) string 'a' by exactly 2 places.

Example 1:
    Input:
    a = amazon
    b = azonam
    Output: 
    1
    Explanation: 
    amazon can be rotated anti-clockwise by two places, which will make it as azonam.

Example 2:
    Input:
    a = geeksforgeeks
    b = geeksgeeksfor
    Output: 
    0
    Explanation: 
    If we rotate geeksforgeeks by two place in any direction, we won't get geeksgeeksfor.
*/

//Code
class RotateString 
{
    
    isRotated(str1, str2)
    {
            
        return str2.slice(-2) + str2.slice(0, -2) == str1 ||
                str2.slice(2) + str2.slice(0, 2) == str1;
    }
}
//Time Complexity = O(N)
