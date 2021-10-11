/* Implement a Stack using two queues q1 and q2.

Example 1:

Input:
push(2)
push(3)
pop()
push(4)
pop()
Output: 3 4
Explanation:
push(2) the stack will be {2}
push(3) the stack will be {2 3}
pop()   poped element will be 3 the 
        stack will be {2}
push(4) the stack will be {2 4}
pop()   poped element will be 4  
Example 2:

Input:
push(2)
pop()
pop()
push(3)
Output: 2 -1 */

class Queues
{
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    
    //Function to push an element into stack using two queues.
    void push(int a)
    {
	    q1.offer(a);
	    while(!q2.isEmpty()){
	        q1.offer(q2.poll());
	    }Queue<Integer> q = q1;
	    q1 = q2;
	    q2 = q;
    }
    
    //Function to pop an element from stack using two queues. 
    int pop()
    {
	    if(q2.isEmpty())return -1;
	    return q2.poll();
    }
	
}

