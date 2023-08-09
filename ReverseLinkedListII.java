/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {

//92. Reverse Linked List II

        Stack<ListNode> s = new Stack<>();
        
        ListNode cur = head, prev=head;
        for(int i=1;i<left;i++)
        {          
         prev = cur;
         cur=cur.next;
        }
        for(int i=left;i<=right;i++)
        {
               s.push(cur);
                cur=cur.next;
        }
        while(!s.empty())
        {
               
                
                  if(left==1)
                 {
                     head = s.pop();
                     prev =head;
                     left=0;
                 }
                 else
                 {
                 prev.next =s.pop();    
                 prev = prev.next;
                 }

        }
        prev.next = cur;
  
       
        
return head;
        
    }
}