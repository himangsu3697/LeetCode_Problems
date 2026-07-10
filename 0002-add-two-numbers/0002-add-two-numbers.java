import java.math.BigInteger;

class Solution {

    ListNode head = null;

    public ListNode constructList(BigInteger n) {

        if (n.equals(BigInteger.ZERO))
            return new ListNode(0);

        while (!n.equals(BigInteger.ZERO)) {

            int digit = n.mod(BigInteger.TEN).intValue();
            ListNode newNode = new ListNode(digit);

            if (head == null) {
                head = newNode;
            } else {
                ListNode i = head;
                while (i.next != null)
                    i = i.next;
                i.next = newNode;
            }

            n = n.divide(BigInteger.TEN);
        }

        return head;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        String n1 = "";
        String n2 = "";

        while (l1 != null) {
            n1 += l1.val;
            l1 = l1.next;
        }

        while (l2 != null) {
            n2 += l2.val;
            l2 = l2.next;
        }

        BigInteger num1 = new BigInteger(new StringBuilder(n1).reverse().toString());
        BigInteger num2 = new BigInteger(new StringBuilder(n2).reverse().toString());

        BigInteger sum = num1.add(num2);

        head = null;        
        return constructList(sum);
    }
}