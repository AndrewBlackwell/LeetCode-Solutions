//---------------------------------------------------------------------
// Given two strings needle and haystack, return the index of the first 
// occurrence of needle in haystack, or -1 if needle is not part of haystack.
// 
// Example 1:
// Input: haystack = "sadbutsad", needle = "sad"
// Output: 0
// Explanation: "sad" occurs at index 0 and 6.
// The first occurrence is at index 0, so we return 0.
// 
// Example 2:
// Input: haystack = "leetcode", needle = "leeto"
// Output: -1
// Explanation: "leeto" did not occur in "leetcode", so we return -1.
//-------------------------------------------------------------------

// Pretty Trivial Solution.

class Solution 
{
    public int strStr(String haystack, String needle) 
    {
        return haystack.indexOf(needle);
    }
}

// This solution first handles the edge cases where the needle is empty or longer than the haystack, 
// returning 0 and -1 respectively. Then, it uses a for loop to iterate through each possible starting 
// index for the needle in the haystack. For each index, it checks if the substring of haystack with 
// the same length as the needle matches the needle. If it does, it returns the index. If no match is found, it returns -1.
