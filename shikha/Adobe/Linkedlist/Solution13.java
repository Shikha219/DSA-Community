/* Given an input stream of A of n characters consisting only of lower case alphabets. The task is to find the first non repeating character, each time a character is inserted to the stream. If there is no such character then append '#' to the answer.
 

Example 1:

Input: A = "aabc"
Output: "a#bb"
Explanation: For every character first non
repeating character is as follow-
"a" - first non-repeating character is 'a'
"aa" - no non-repeating character so '#'
"aab" - first non-repeating character is 'b'
"aabc" - first non-repeating character is 'b'
Example 2:

Input: A = "zz"
Output: "z#"
Explanation: For every character first non
repeating character is as follow-
"z" - first non-repeating character is 'z'
"zz" - no non-repeating character so '#' */

class Solution
{
    public String FirstNonRepeating(String a)
    {
        int hash[] = new int[26];
        StringBuilder s = new StringBuilder();
        Queue<Character> q = new LinkedList<Character>();
        
        for(int i = 0;i<a.length();i++) {
            hash[a.charAt(i)-'a']++;
            q.add(a.charAt(i));
            while(!q.isEmpty()) {
                if(hash[q.peek()-'a']>1)
                {
                    q.poll();
                }else{
                    break;
                }
            }
            
            if(q.isEmpty())
                s.append("#");
            else
                s.append(q.peek());
            
        }
        return s.toString();
    }
}
