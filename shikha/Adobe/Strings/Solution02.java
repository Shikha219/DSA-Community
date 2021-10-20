/* Given a String S, reverse the string without reversing its individual words. Words are separated by dots.

Example 1:

Input:
S = i.like.this.program.very.much
Output: much.very.program.this.like.i
Explanation: After reversing the whole
string(not individual words), the input
string becomes
much.very.program.this.like.i
Example 2:

Input:
S = pqr.mno
Output: mno.pqr
Explanation: After reversing the whole
string , the input string becomes
mno.pqr */

class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String str)
    {
        String s[] = str.split("\\.");
        String ans = s[s.length-1];
        for(int i = s.length-2;i>=0;i--){
            ans+="."+s[i];
        }
        return ans;
    }
}
