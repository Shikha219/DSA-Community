/* Complete the function to find spiral order traversal of a tree. For below tree, function should 
return 1, 2, 3, 4, 5, 6, 7.


 
 

Example 1:

Input:
      1
    /   \
   3     2
Output:1 3 2

Example 2:

Input:
           10
         /     \
        20     30
      /    \
    40     60
Output: 10 20 30 60 40 */

class Spiral
{
    //Function to return a list containing the level order 
    //traversal in spiral form.	
    ArrayList<Integer> findSpiral(Node node) 
    {
        ArrayList<Integer> a = new ArrayList<>();
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();
        if(node == null){
            return a;
        }s1.push(node);
        while(!s1.isEmpty() || !s2.isEmpty()){
            while(!s1.isEmpty()){
                Node temp = s1.pop();
                a.add(temp.data);
                if(temp.right!=null){
                    s2.push(temp.right);
                }if(temp.left!=null){
                    s2.push(temp.left);
                }
            }while(!s2.isEmpty()){
                Node temp = s2.pop();
                a.add(temp.data);
                if(temp.left!=null){
                    s1.push(temp.left);
                }if(temp.right!=null){
                    s1.push(temp.right);
                }
            }
        }return a;
    }
}
