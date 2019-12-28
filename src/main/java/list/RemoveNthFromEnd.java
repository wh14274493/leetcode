package list;

import common.Printer;

/**
 * @author wang hao
 * @created 2019/12/28 17:19
 * @contact 14274493
 */
public class RemoveNthFromEnd {

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        if (n <= 0) {
            return head;
        }
        ListNode point = head;
        ListNode pre = head;
        int first = 0, second = 0;
        while (point != null) {
            second = first - n;
            if (second > 0) {
                pre = pre.next;
            }
            first++;
            point = point.next;
        }
        if (second == -1) {
            return head.next;
        }
        if (second >= 0) {
            pre.next = pre.next.next;
        }
        if (second == first - 2) {
            pre.next = null;
        }
        return head;
    }

    public static void main(String[] args) {

        ListNode listNode = new ListNode(2);
        ListNode listNode1 = new ListNode(8);
        ListNode listNode2 = new ListNode(9);
        ListNode listNode3 = new ListNode(5);
        ListNode listNode4 = new ListNode(7);
        ListNode listNode5 = new ListNode(4);
        ListNode listNode6 = new ListNode(9);
        listNode.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = listNode6;
        ListNode node = removeNthFromEnd(listNode, 7);
        Printer.print(node);

    }
}
