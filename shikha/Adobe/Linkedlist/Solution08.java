/* Given Pointer/Reference to the head of the linked list, the task is to Sort the given linked list using Merge Sort.
Note: If the length of linked list is odd, then the extra node should go in the first list while splitting.

Example 1:

Input:
N = 5
value[]  = {3,5,2,4,1}
Output: 1 2 3 4 5
Explanation: After sorting the given
linked list, the resultant matrix
will be 1->2->3->4->5.
Example 2:

Input:
N = 3
value[]  = {9,15,0}
Output: 0 9 15
Explanation: After sorting the given
linked list , resultant will be
0->9->15. */

class Solution
{
    static Node findMid(Node head){
        Node fast = head;
        Node slow = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }return slow;
    }
    
    
    //Function to sort the given linked list using Merge Sort.
    static Node mergeSort(Node head)
    {
        if(head.next==null)
       return head;
       
       Node mid = findMid(head);
       Node midNext = mid.next;
       mid.next = null;
       
       Node a = mergeSort(head);
       Node b = mergeSort(midNext);
       
       
       Node result = merge(a,b);
       
       return result;
        
    }
    static Node merge(Node head1, Node head2)
   {
       Node result = null;
       
       if(head1==null)
       {
           return head2;
      
       }
       if(head2==null)
       {
           return head1;
       }
       
       if(head1.data<=head2.data)
       {
           result = head1;
           result.next = merge(head1.next,head2);
       }
       else
       {
           result = head2;
           result.next = merge(head1,head2.next);
       }
       
       return result;
   }
}
