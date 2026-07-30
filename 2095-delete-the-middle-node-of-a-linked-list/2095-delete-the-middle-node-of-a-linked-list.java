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
        if(head == null || head.next == null) {
            return null;
        }
        ListNode hair = head;
        ListNode turtle = head;
        ListNode prev = null;
        while(hair != null && hair.next != null) {
            prev = turtle;
            hair = hair.next.next;
            turtle = turtle.next;
        }
        prev.next = prev.next.next;
        return head;
    }
}