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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int sz = 0;
        ListNode temp = head;

        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        // Step 2:to remove the first node
        if (n == sz) {
            head = head.next;
            return head;
        }

        // Step 3: Find the node before the node to remove
        int i = 1;
        int iToFind = sz - n;
        ListNode prev = head;

        while (i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;

        return head;
    }
}
