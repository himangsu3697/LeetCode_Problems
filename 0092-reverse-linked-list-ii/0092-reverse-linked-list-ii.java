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
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        if (left == right) {
            return head;
        }
        ListNode l = dummy;
        ListNode r;
        for (int i = 1; i < left; i++) {
            l = l.next;
        }
        r = l.next;
        for (int i = left; i < right; i++) {
            r = r.next;
        }
        ListNode re = r; //reverse end node
        r = r.next; 
        ListNode p = l.next;
        ListNode q = p.next;
        ListNode tail = p;
        re.next = null;
        p.next = null;
        while (q != null) {
            ListNode next = q.next;
            q.next = p;
            p = q;
            q = next;
        }
        l.next = p;
        tail.next = r;
        return dummy.next;
    }
}