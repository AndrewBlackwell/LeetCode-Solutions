//-----------------------------------------------------------------------------------------
// Given a string s, find the length of the longest substring without repeating characters.
// 
// Example 1:
// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3.
//
// Example 2:
// Input: s = "bbbbb"
// Output: 1
// Explanation: The answer is "b", with the length of 1.
//------------------------------------------------------

class Solution 
{
    public int lengthOfLongestSubstring(String s) 
    {
        Set<Character> set = new HashSet();
        int max = 0;
        int left = 0;
        for (int right = 0; right < s.length(); right++) 
        {
            while(!set.add(s.charAt(right))) 
            {
                set.remove(s.charAt(left++));
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}

// Time Complexity is O(N)
