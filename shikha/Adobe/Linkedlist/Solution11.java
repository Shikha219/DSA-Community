/* Given a linked list of N nodes such that it may contain a loop.

A loop here means that the last node of the link list is connected to the node at position X. If the link list does not have any loop, X=0.

Remove the loop from the linked list, if it is present.  


Example 1:

Input:
N = 3
value[] = {1,3,4}
X = 2
Output: 1
Explanation: The link list looks like
1 -> 3 -> 4
     ^    |
     |____|    
A loop is present. If you remove it 
successfully, the answer will be 1. 

Example 2:

Input:
N = 4
value[] = {1,8,3,4}
X = 0
Output: 1
Explanation: The Linked list does not 
contains any loop. 

Example 3:

Input:
N = 4
value[] = {1,2,3,4}
X = 1
Output: 1
Explanation: The link list looks like 
1 -> 2 -> 3 -> 4
|______________|
A loop is present. 
If you remove it successfully, 
the answer will be 1. */

class Solution
{
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
        if(head == null || head.next == null){
            return;
        }
        Node fast = head;
        Node slow = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                break;
            }
        }if(slow==head){
            while(slow.next!=head){
                slow = slow.next;
            }slow.next = null;
            
        }if(slow == fast){
            slow = head;
            while(slow.next!=fast.next){
                if(slow == fast.next){
                    fast.next = null;
                }slow = slow.next;
                fast= fast.next;
            }fast.next = null;
        }

    }
}
