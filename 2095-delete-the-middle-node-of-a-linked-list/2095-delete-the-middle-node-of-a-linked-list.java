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
    public ListNode deleteMiddle(ListNode head) {
        ListNode f = head;
        ListNode s = head;
        ListNode prev = head;
        
        while(f != null && f.next!= null){
            prev=s;
            f=f.next.next;
            s=s.next;
        }
        if(prev.next!= null){
            prev.next=prev.next.next;
        }
        if(f==s){
            head=null;
        }
        return head;
    }
}