/* Given two numbers as stings s1 and s2. Calculate their Product.


Example 1:

Input:
s1 = "33"
s2 = "2"
Output:
66
Example 2:

Input:
s1 = "11"
s2 = "23"
Output:
253 */


class Solution
{
    public String multiplyStrings(String s1,String s2)
    {
        return String.valueOf((new BigInteger(s1)).multiply(new BigInteger(s2)));
    }
}
