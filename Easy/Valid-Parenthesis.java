//-------------------------------------------------
// Given a string s containing just the characters
// '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
// An input string is valid if:
// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.
// Every close bracket has a corresponding open bracket of the same type. 
// 
// Example 1:
// Input: s = "()"
// Output: true
// 
// Example 2:
// Input: s = "()[]{}"
// Output: true
//-------------

public boolean isValid(String s) 
{
	Stack<Character> stack = new Stack<Character>();
	for (char c : s.toCharArray()) 
  {
		if (c == '(')
			stack.push(')');
		else if (c == '{')
			stack.push('}');
		else if (c == '[')
			stack.push(']');
		else if (stack.isEmpty() || stack.pop() != c)
			return false;
	}
	return stack.isEmpty();
}

// We use a stack to keep track of the opening brackets we encounter. 
// For each character in the string, if it's an opening bracket, we push it onto the stack. 
// If it's a closing bracket, we check if it matches the top of the stack 
// (i.e., the most recent opening bracket we encountered). 
// If it doesn't match, the string is invalid and we return false. If it matches, 
// we pop the opening bracket from the stack and continue. If the stack is empty at the end of the loop, 
// it means all opening brackets were matched and the string is valid. 
// Otherwise, there are unmatched opening brackets and the string is invalid.

// Time-Complexity is O(N) here, where n = the number of items in s.toCharArray().

