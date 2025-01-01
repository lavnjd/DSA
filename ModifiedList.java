class ModifiedList {
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> dup = new HashSet();
        for(int num:nums) dup.add(num);
        ListNode result = new ListNode(0);
        ListNode ans = result;
        while(head != null){
            if(!dup.contains(head.val)){
                ans.next = head;
                ans = ans.next;
            }
            head = head.next;
        }
        ans.next = null;
        return result.next;
    }
}