class doubleIt{
    public ListNode doubleIt(ListNode head) {
        ListNode ans = new ListNode(-1000);
        ListNode result = ans;
        ListNode temp = head;
        ListNode pre = null;
        while(temp != null){
            ListNode front = temp.next;
            temp.next = pre;
            pre = temp;
            temp = front;
        }

        ListNode calculate = pre;
        int carry = 0;
        while(calculate != null){
            result.next = new ListNode(((2*calculate.val)+carry)%10);
            result = result.next;
            carry = ((2*calculate.val)+carry)/10;
            calculate = calculate.next;
            
        }
        if(carry !=0){
            result.next = new ListNode(carry);
            result = result.next;
        }

        ListNode temp1 = ans.next;
        ListNode pre1 = null;
        while(temp1 != null){
            ListNode front1 = temp1.next;
            temp1.next = pre1;
            pre1 = temp1;
            temp1 = front1;
        }
        return pre1;

        
    }
}