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
    public ListNode rotateRight(ListNode head, int k) {
        if(k == 0 || head == null || head.next == null) {
            return head;
        }
        ListNode temp = head;
        int len = 0;
        ListNode end = null;
        while(temp != null) {
            len++;
            if(temp.next == null) {
                end = temp;
            }
            temp = temp.next;
        }
        k = k%len;
        if(k == 0) {
            return head;
        }
        end.next = head;
        temp = head;
        for(int i=1; i< len - k; i++) {
            temp = temp.next;
        }
        head = (temp.next != null) ? temp.next : head;
        temp.next = null;
        return head;
    }
}