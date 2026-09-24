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
        // if (list1 == null) {
        //     return list2;
        // }

        // if (list2 == null) {
        //     return list1;
        // }

        // if (list1.val > list2.val) {
        //     list2.next = mergeTwoLists(list1, list2.next);
        //     return list2;
        // } else {
        //     list1.next = mergeTwoLists(list1.next, list2);
        //     return list1;
        // }

        ListNode node = new ListNode(0);
        ListNode dummy = node;

        while (list1 != null && list2 != null ) {
            if (list1.val > list2.val) {
                node.next = list2;
                list2 = list2.next;
            } else {
                node.next = list1;
                list1 = list1.next;
            }
            node = node.next;
        }

        if (list1 == null) {
            node.next = list2;
        } else {
            node.next = list1;
        }

        return dummy.next;
    }
}