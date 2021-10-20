/* Given an expression string x. Examine whether the pairs and the orders of “{“,”}”,”(“,”)”,”[“,”]” are correct in exp.
For example, the function should return 'true' for exp = “[()]{}{[()()]()}” and 'false' for exp = “[(])”.

Example 1:

Input:
{([])}
Output: 
true
Explanation: 
{ ( [ ] ) }. Same colored brackets can form 
balaced pairs, with 0 number of 
unbalanced bracket.
Example 2:

Input: 
()
Output: 
true
Explanation: 
(). Same bracket can form balanced pairs, 
and here only 1 type of bracket is 
present and in balanced way.
Example 3:

Input: 
([]
Output: 
false
Explanation: 
([]. Here square bracket is balanced but 
the small bracket is not balanced and 
Hence , the output will be unbalanced. */


class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        int n = x.length();
        if(n%2!=0 || n==0) return false;
        Stack<Character> st = new Stack<>();
        for(char c: x.toCharArray()){
            if(c=='(') st.push(')');
            else if (c=='{') st.push('}');
            else if(c=='[') st.push(']');
            else if(st.isEmpty() || st.pop()!=c) return false;
        }return st.isEmpty();
    }
}
