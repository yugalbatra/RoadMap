package LinkedList;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(4);
        ListNode removedDuplicates = removeDuplicates(head);
        while (removedDuplicates != null) {
            System.out.println(removedDuplicates.val);
            removedDuplicates = removedDuplicates.next;
        }
    }

    public static ListNode removeDuplicates(ListNode head) {
        Set<Integer> set = new HashSet<>();
        ListNode curr = head, prev = head;
        while (curr != null) {
            if (set.contains(curr.val)) {
                prev.next = prev.next.next;
                curr = curr.next;
                continue;
            }
            set.add(curr.val);
            prev = curr;
            curr = curr.next;
        }
        return head;
    }
}
