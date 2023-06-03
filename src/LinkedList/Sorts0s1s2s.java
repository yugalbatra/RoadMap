package LinkedList;

public class Sorts0s1s2s {

    public static ListNode sort(ListNode head) {
        int[] count = new int[3];
        while (head != null) {
            count[head.val]++;
            head = head.next;
        }
        boolean first = true;
        ListNode newHead = null, temp = null;
        for (int i = 0; i < count.length; i++) {
            while (count[i] != 0) {
                if (newHead == null){
                    newHead = new ListNode(i);
                    temp = newHead;
                    count[i]--;
                    continue;
                }
                temp.next = new ListNode(i);
                temp = temp.next;
                count[i]--;
            }
        }
        return newHead;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode temp = head;
        temp.next = new ListNode(1);
        temp = temp.next;
        temp.next = new ListNode(2);
        temp = temp.next;
        temp.next = new ListNode(0);
        temp = temp.next;
        temp.next = new ListNode(2);
        temp = temp.next;
        temp.next = new ListNode(0);
        ListNode newHead = sort(head);
        while (newHead!=null){
            System.out.println(newHead.val);
            newHead = newHead.next;
        }
    }
}
