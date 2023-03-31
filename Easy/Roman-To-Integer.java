//-----------------------------------------------------------------------------------
// Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
// Symbol       Value
// I             1
// V             5
// X             10
// L             50
// C             100
// D             500
// M             1000
// For example, 2 is written as II in Roman numeral, just two ones added together. 
// 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
// Given a roman numeral, convert it to an integer.
// 
// Example 1:
// Input: s = "III"
// Output: 3
// Explanation: III = 3.
// 
// Example 2:
// Input: s = "LVIII"
// Output: 58
// Explanation: L = 50, V= 5, III = 3. 
//------------------------------------

class Solution
{
    public int romanToInt(String s) 
    {
        //initialize three variables: answer, current element, and previous
        int answer = 0, number = 0, prev = 0;
        // loop through array and assign values.
        for (int j = s.length() - 1; j >= 0; j--) 
        {
            switch (s.charAt(j)) 
            {
                case 'M' -> number = 1000;
                case 'D' -> number = 500;
                case 'C' -> number = 100;
                case 'L' -> number = 50;
                case 'X' -> number = 10;
                case 'V' -> number = 5;
                case 'I' -> number = 1;
            }
            // these cover the case of fours and nines, since these are the
            // only cases when previous is less than current. 
            if (number < prev) 
            {
            answer -= number;
            }
            // otherwise, add to answer and set current to previous.
            else 
            {
                answer += number;
            }
            prev = number;
        }
        return answer;
    }
}
