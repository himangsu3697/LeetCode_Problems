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

    public ListNode reverse(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public boolean isPalindrome(ListNode head) {
        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        if (size <= 2) {
            if (size == 1 || head.val == head.next.val) {
                return true;
            } else {
                return false;
            }
        }
        ListNode head1 = head;
        ListNode head2 = head;
        int mid = size / 2;
        for (int i = 1; i <= mid; i++) {
            head2 = head2.next;
        }
        head2 = reverse(head2);
        while (head2 != null) {
            if (head1.val == head2.val) {
                head1 = head1.next;
                head2 = head2.next;
            } else {
                return false;
            }
        }
        return true;
    }
}