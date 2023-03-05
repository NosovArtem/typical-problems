package study.addTwoNumbers;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return createNode(0, l1, l2);
    }

    public ListNode createNode(int inMind, ListNode l1, ListNode l2) {
        int val1 = l1 == null ? 0 : l1.val;
        int val2 = l2 == null ? 0 : l2.val;

        int sum = inMind + val1 + val2;
        inMind = sum / 10;
        int val = sum % 10;

        if (l1.next == null && l2.next == null) {
            return  inMind == 0 ? new ListNode(val) : new ListNode(val, new ListNode(inMind));
        }

        return new ListNode(val, createNode(inMind,
                l1.next == null ? new ListNode(0) : l1.next,
                l2.next == null ? new ListNode(0) : l2.next
        ));
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}



