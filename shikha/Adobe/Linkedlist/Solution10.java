/* Given two singly linked lists of size N and M, write a program to get the point where two linked lists intersect each other.

 

Example 1:

Input:
LinkList1 = 3->6->9->common
LinkList2 = 10->common
common = 15->30->NULL
Output: 15
Explanation:
Y ShapedLinked List
Example 2:

Input: 
Linked List 1 = 4->1->common
Linked List 2 = 5->6->1->common
common = 8->4->5->NULL
Output: 8
Explanation: 

4              5
|              |
1              6
 \             /
  8   -----  1 
   |
   4
   |
  5
  |
  NULL  */

class Intersect
{
    //Function to find intersection point in Y shaped Linked Lists.
	int intersectPoint(Node head1, Node head2)
	{
         int len1 = 0,len2 = 0;
         Node temp1 = head1, temp2 = head2;
         while(temp1!=null){
             len1++;temp1 = temp1.next;
         }
         while(temp2!=null){
             len2++;temp2 = temp2.next;
         }int diff = Math.abs(len1-len2);
         temp1 = head1;temp2 = head2;
         if(len1>len2){
             
             for(int i = 0;i<diff;i++){
                 temp1 = temp1.next;
             }
         }else{
             for(int i = 0;i<diff;i++){
                 temp2 = temp2.next;
             }
         }while(temp1!=temp2){
             temp1 = temp1.next;
             temp2 = temp2.next;
         }return temp1.data;
	}
}
