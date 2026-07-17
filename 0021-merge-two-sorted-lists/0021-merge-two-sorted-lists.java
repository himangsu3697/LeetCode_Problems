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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode res = null;
        ListNode l1=list1,l2=list2;
        ListNode newNode;
        while(l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                newNode = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                newNode = new ListNode(l2.val);
                l2 = l2.next;
            }
            if(res == null) {
                res = newNode;
            } else {
                ListNode i = res;
                for(; i.next != null; i=i.next);
                i.next = newNode;
            }
        }
        while(l1 != null) {
            newNode = new ListNode(l1.val);
            if(res == null) {
                res = newNode;
            } else {
                ListNode i = res;
                for(; i.next != null; i=i.next);
                i.next = newNode;
            }
            l1 = l1.next;
        }
        while(l2 != null) {
            newNode = new ListNode(l2.val);
            if(res == null) {
                res = newNode;
            } else {
                ListNode i = res;
                for(; i.next != null; i=i.next);
                i.next = newNode;
            }
            l2 = l2.next;
        }
        return res;
    }
}