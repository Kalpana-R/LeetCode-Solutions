/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
      //138. Copy List with Random Pointer
     Map<Node, Integer> map = new HashMap<>(); 
     Map<Integer, Node> map1 = new HashMap<>(); 
     Node cur = head;
     Node l = new Node(0);
     Node res = l;
     int count=0;
     while(cur!=null)
     {
         map.put(cur,count);
         res.next = new Node(cur.val);
         cur = cur.next;
         res= res.next;
         map1.put(count,res);
         count++;       
     }

     cur = head; res = l.next;
     while(cur!=null)
     {
        res.random = map1.get(map.get(cur.random));
        res= res.next;
        cur=cur.next;
     
     }

return l.next;

        
    }
}