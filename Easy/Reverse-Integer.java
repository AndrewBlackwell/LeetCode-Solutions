//-------------------------------------------------------------
// Given a 32-bit signed integer, reverse digits of an integer.
// 
// Example 1:
// Input: 123
// Output:  321
// 
// Example 2:
// Input: -123
// Output: -321
//
// Assume we are dealing with an environment which could only hold 
// integers within the 32-bit signed integer range. 
// For the purpose of this problem, assume that your function
// returns 0 when the reversed integer overflows.
//-----------------------------------------------

class Solution {
    public int reverse(int x) {
        long res = 0;
        for (; x != 0; x /= 10)
            res = res * 10 + x % 10;
        return res > Integer.MAX_VALUE || res < Integer.MIN_VALUE ? 0 : (int) res;
    }
}
// The idea is to give you an integer number, find its inverse integer number. 
// There is a small pitfall, when its inverse integer number overflow, then it will return 0.
// With our code, we can find the results saved in long, and finally the results and the two ranges of integers can be compared.
