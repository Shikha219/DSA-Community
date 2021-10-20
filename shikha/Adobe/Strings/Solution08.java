/* Given a String. Reverse each word in it where the words are separated by dots.

Example 1:

Input:
S = "i.like.this.program.very.much"
Output: i.ekil.siht.margorp.yrev.hcum
Explanation: The words "i", "like",
"this", "program", "very", "much"
are all reversed.
â€‹Example 2:

Input: 
S = "pqr.mno"
Output: rqp.onm
Explanation: Both "pqr" and "mno" are
reversed. */
class Solution
{
   
    String reverseWords(String str)
    {
       StringBuilder ans = new StringBuilder() ; 
       Stack<Character> stack = new Stack<>() ;
       
       for (int i = 0 ; i < str.length() ; i++) {
            char ch = str.charAt(i) ; 
            
            if (ch != '.')stack.push(ch) ; 
            
            else { 
                while(!stack.isEmpty())
                ans.append(stack.pop()) ; 
                
                ans.append('.') ; 
            }
       }
       while(!stack.isEmpty())
       ans.append(stack.pop()) ; 
       
       return ans.toString();
    }
}
