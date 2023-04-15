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
}// Time Complexity is O(N)

class Solution 
{
    public int lengthOfLongestSubstring(String s) 
    {
        int n = s.length();
        int ans = 0;
        int[] index = new int[128];
        for (int j = 0, i = 0; j < n; j++)
        {
            i = Math.max(index[s.charAt(j)], i);
            ans = Math.max(ans, j - i + 1);
            index[s.charAt(j)] = j + 1;
        }
        return ans;
    }
}// Time Complexity O(N)

// COMPARISON OF SOLUTIONS:
// The first method uses a Set to keep track of the characters in the current substring, 
// and shifts the left pointer until no repeating character is found. 
// The second method uses an array to keep track of the last index of each character, 
// and updates the left pointer to exclude the repeated character from the current substring.
// In terms of efficiency, the second method is generally more efficient than the first method. 
// The first method has a time complexity of O(n^2) in the worst case, since in the worst case scenario where all characters are distinct, 
// the while loop will execute n times for each value of right. The second method has a time complexity of O(n), 
// since it only iterates through the string once and performs constant time operations for each character.
// The space complexity of both methods is O(1), since the maximum size of the Set or the array is fixed at 128, 
// which is the number of ASCII characters. However, the second method uses an array which has a constant access time, 
// while the first method uses a Set which has a worst case access time of O(n) due to its implementation as a hash table.
// Therefore, in terms of time and space complexity, the second method is more efficient than the first method.
