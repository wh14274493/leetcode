package list;

public class ListNodeAdd {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(0);
        ListNode point = listNode;
        int add = 0;
        while (l1 != null || l2 != null) {
            int x = l1 != null ? l1.val : 0;
            int y = l2 != null ? l2.val : 0;
            int sum = x + y + add;
            if (sum > 9) {
                sum = sum - 10;
                add = 1;
            } else {
                add = 0;
            }
            ListNode node = new ListNode(sum);
            point.next = node;
            point = point.next;
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
            if (add > 0) {
                point.next = new ListNode(add);
            }
        }
        return listNode.next;
    }

    public static void main(String[] args) {

        ListNode listNode = new ListNode(2);
        ListNode listNode1 = new ListNode(8);
        ListNode listNode2 = new ListNode(9);
        listNode.next = listNode1;
        listNode1.next = listNode2;
        ListNode listNode3 = new ListNode(5);
        ListNode listNode4 = new ListNode(7);
        ListNode listNode5 = new ListNode(4);
        ListNode listNode6 = new ListNode(9);
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = listNode6;
        ListNode node = new ListNodeAdd().addTwoNumbers(listNode, listNode3);
        while (node != null) {
            System.out.print(node.val + "->");
            node = node.next;
        }

    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
