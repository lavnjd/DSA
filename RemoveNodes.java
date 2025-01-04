/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class RemoveNodes {
    public static ListNode reversal(ListNode trans) {
        ListNode reverse = trans;
        ListNode pre = null;
        while (reverse != null) {
            ListNode front = reverse.next;
            reverse.next = pre;
            pre = reverse;
            reverse = front;
        }
        return pre;

    }

    public ListNode removeNodes(ListNode head) {
        ListNode temp = reversal(head);
        ListNode result = new ListNode(temp.val);
        ListNode res = result;
        ListNode traverse = temp.next;

        int maxi = res.val;
        while (traverse != null) {
            if (traverse.val >= maxi) {
                maxi = traverse.val;
                res.next = new ListNode(maxi);
                res = res.next;
            }
            traverse = traverse.next;
        }
        return reversal(result);
    }
}