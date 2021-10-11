/* Design a data-structure SpecialStack that supports all the stack operations like push(), pop(), isEmpty(), isFull() and an additional 
operation getMin() which should return minimum element from the SpecialStack. 
Your task is to complete all the functions, using stack data-Structure.


Example 1:

Input:
Stack: 18 19 29 15 16
Output: 15
Explanation:
The minimum element of the stack is 15. */

class GfG{
    
	public void push(int a,Stack<Integer> s)
	{
	    if(s.isEmpty()){
	        s.push(a);
	    }else{
	        if(s.peek()>a){
	            s.push(a);
	        }else{
	            s.push(s.peek());
	        }
	    }
	}
	public int pop(Stack<Integer> s)
        {
            if(!s.isEmpty()){
                int top = s.peek();
                s.pop();
                return top;
            }return -1;
	}
	public int min(Stack<Integer> s)
        {
           return s.pop();
	}
	public boolean isFull(Stack<Integer>s, int n)
        {if(s.size()==n){
            return true;
        }return false;
           
	}
	public boolean isEmpty(Stack<Integer>s)
        {
           if(s.isEmpty()){
               return true;
           }return false;}
}
