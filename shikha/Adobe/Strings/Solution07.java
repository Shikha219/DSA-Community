/* Your task  is to implement the function atoi. The function takes a string(str) as argument and converts it to an integer and returns it.

Note: You are not allowed to use inbuilt function.

Example 1:

Input:
str = 123
Output: 123
Example 2:

Input:
str = 21a
Output: -1
Explanation: Output is -1 as all
characters are not digit only. */


class Solution
{
    int atoi(String str) {
       int num=0;
       for(int i=0;i<str.length();i++)
       {
            char s = str.charAt(i);
           if((s>='0'&&s<='9')||(s=='-'&&i==0))
           {
               if(str.charAt(0)=='-')
               {
                   num*=10;
                   if(s=='-')num*=-1;
                   else num-=(s-'0');
               }
              else
               {
               num*=10;
               num+=(s-'0');
               }
           }
           else return -1;
       }
       return num;
   }
}
