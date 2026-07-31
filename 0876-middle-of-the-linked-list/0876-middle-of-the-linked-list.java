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
    public ListNode middleNode(ListNode head) {
        ListNode hair = head;
        ListNode turtle = head;
        while(hair != null && hair.next != null) {
            hair = hair.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }
}