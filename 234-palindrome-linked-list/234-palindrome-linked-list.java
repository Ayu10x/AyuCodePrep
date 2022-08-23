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
    public boolean isPalindrome(ListNode head) {
     ListNode pointer = head;
        boolean res = true;
        Stack<Integer> stack =  new Stack<Integer>();
        
        while(pointer != null){
            stack.push(pointer.val);
            pointer = pointer.next;
        }
        
        while(head != null){
            int i=stack.pop();
            if(head.val == i){
                res = true;
            }else{
               res = false;
            break;
            }
            head = head.next;
        }
        return res;
    }
}