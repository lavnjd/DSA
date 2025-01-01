class SortList {
    public static ListNode mergeIt(ListNode first, ListNode second){
        ListNode a = first;
        ListNode b = second;
        ListNode ans = new ListNode(-10);
        ListNode res = ans;
        while(a!=null && b!=null){
            if(a.val<=b.val){
                res.next = a;
                a = a.next;
            }else{
                res.next = b;
                b = b.next;
            }
            res = res.next;
        }
        if(a!=null){
            res.next = a;
        }
        if(b!=null){
            res.next = b;
        }
        return ans.next;

    }
    public static ListNode findMiddle(ListNode temp){
        ListNode slow = temp;
        ListNode fast = temp.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode middle = findMiddle(head);
        ListNode right = middle.next;
        middle.next = null;
        ListNode left = head;
        left = sortList(left);
        right = sortList(right);
        return mergeIt(left,right);
    }
}