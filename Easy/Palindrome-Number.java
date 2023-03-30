//------------------------------------------
// Given an integer x, return true if x is a 
// palindrome, and false otherwise.
//
// Example 1:
// Input: x = 121
// Output: true
// Explanation: 121 reads as 121 from left to right and from right to left.
// 
// Example 2:
// Input: x = -121
// Output: false
// Explanation: From left to right, it reads -121. From right to left, it becomes 121-. 
// Therefore it is not a palindrome.
//-----------------------------------

class Solution 
{
    public boolean isPalindrome(int x) 
    {
        String s = String.valueOf(x);
        int i = 0;
        int j = s.length() -1;
        while (i <= j)
        {
            if (s.charAt(i) != s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

// Trace:
// Convert the integer to a string using the valueOf() method of the String class.
// Set two pointers i and j to the start and end of the string respectively.
// Compare the characters at the ith and jth positions of the string.
// If they are not equal, return false because the string is not a palindrome.
// If they are equal, increment i and decrement j to move the pointers towards the middle of the string.

// The time complexity of this algorithm is O(n/2), where n is the length of the string, 
//because it only needs to check half of the string to determine whether it is a palindrome or not.
