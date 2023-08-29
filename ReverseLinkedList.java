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
    public ListNode reverseList(ListNode head) {
    
    //206. Reverse Linked List

    ListNode prev =null, cur = head, next =null;

    while(cur!=null)
    {
        next = cur.next;
        cur.next =prev;
        prev =cur;
        cur = next;
    }



return prev;
    }
}