//------------------------------------------------------------------------------------------------
// Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. 
// The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
// Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
// Change the array nums such that the first k elements of nums contain the elements which are not equal to val. 
// The remaining elements of nums are not important as well as the size of nums.
// Return k.
// 
// Example 1:
// Input: nums = [3,2,2,3], val = 3
// Output: 2, nums = [2,2,_,_]
// Explanation: Your function should return k = 2, with the first two elements of nums being 2.
// It does not matter what you leave beyond the returned k (hence they are underscores).
//---------------------------------------------------------------------------------------

public class Solution 
{
    public int removeElement(int[] nums, int val) 
    {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
            nums[count]=nums[i];
            count++;
            }
        }
        return count;
    }
}

// This solution uses a two-pointer approach to remove the elements. 
// It initializes a counter count to zero, and then iterates through the array nums using a for loop.
// For each element in the array, if the element is not equal to val, the method copies that element 
// to the position at index count in the array, and increments the counter count. 
// In other words, it shifts all the elements that are not equal to val to the front of the array, while keeping their relative order the same.
// Finally, the method returns the value of the counter count, which represents the new length of the array after removing all occurrences of val.

// Time complexity = O(n), where n is equal to nums.length.
