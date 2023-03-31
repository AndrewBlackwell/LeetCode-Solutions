//---------------------------------------------------------------------------------------
// Write a function to find the longest common prefix string amongst an array of strings.
// If there is no common prefix, return an empty string "".
// 
// Example 1:
// Input: strs = ["flower","flow","flight"]
// Output: "fl"
// 
// Example 2:
// Input: strs = ["dog","racecar","car"]
// Output: ""
// Explanation: There is no common prefix among the input strings.
//----------------------------------------------------------------

class Solution 
{
    public String longestCommonPrefix(String[] strs) 
    {
        //check for null case, because sometimes users suck.
        if (strs == null || strs.length == 0)
        {
            return "";
        }
        // sort by alphabetical order
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int current = 0;
        while(current < first.length())
        {
            //compare 
            if (first.charAt(current) == last.charAt(current))
            {
                current++;
            }
            else
            {
                break;
            }
        }
        // return substring if full, empty otherwise.
        if(current == 0)
        {
            return "";
        }
        else
        {
            return first.substring(0,current);
        }
    }
}

//Time complexity is O(1)
