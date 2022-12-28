public class ListNode2 {
    int val;
    ListNode next;

    ListNode2() {
    }

    ListNode2(int val) {
        this.val = val;
    }

    ListNode2(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution2 {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;

       while (current.next != null && current.next.next != null) {
            ListNode first = current.next;
            ListNode second = current.next.next;
         first.next = second.next;
         current.next = second;
         current.next.next = first;
         current = current.next.next;
        }
        return dummy.next;
    }
}
