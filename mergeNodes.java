class mergeNodes{
     public ListNode mergeNodes(ListNode head) {
        ListNode start = head;
        ListNode end = head;
        int sum =0;
        ListNode result = new ListNode(-10000);
        ListNode ans = result;
        while(end!=null){
            if(end.val!=0){
                sum = sum+end.val;
            }else if(end.val ==0){
                ans.next = new ListNode(sum);
                ans = ans.next;
                sum=0;
            }
            end = end.next;
               
        }
        if(result.next.val == 0){
            return result.next.next;
        }
        return result.next;
        
    }
    
}