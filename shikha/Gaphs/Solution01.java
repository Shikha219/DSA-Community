/* Consider a directed graph whose vertices are numbered from 1 to n. There is an edge from a vertex i to a vertex j iff either j = i + 1 or j = 3 * i. The task is to find the minimum number of edges in a path in G from vertex 1 to vertex n.


Example 1:

Input:
N = 9
Output:
2
Explanation:
9 -> 3 -> 1, so
number of steps are 2. 
â€‹Example 2:

Input:
N = 4
Output:
2
Explanation:
4 -> 3 -> 1, so
number of steps are 2. */


class Solution{
    static int minStep(int n){
        int count = 0;
        while(n>1){
            if(n%3==0){
                n/=3;
            }else{
                n--;
            }count++;
        }return count;
    }
}
