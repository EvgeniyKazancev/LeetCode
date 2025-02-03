package com.all;

public class ListNode3 {
    int val;
    ListNode next;

    ListNode3() {
    }

    ListNode3(int val) {
        this.val = val;
    }

    ListNode3(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
           ListNode temp = head;
            while (temp != null && temp.next != null ){
              if (temp.val == temp.next.val){
                  temp.next = temp.next.next;
                  continue;
              }
              temp = temp.next;
            }
            return head;
        }

    }
}
