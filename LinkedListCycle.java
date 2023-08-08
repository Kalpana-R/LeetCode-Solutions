/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
       
        ListNode faster = head;
        ListNode slower = head;
        while(faster!=null && faster.next!=null)
        {
            slower = slower.next;
            faster = faster.next.next;
            if(faster==slower)
             return true;

        }
        
        return false;
    }
}