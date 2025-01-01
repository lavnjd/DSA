class InsertGreatestCommonDivisors {
    public static int findGcd(int a, int b){
        for(int i=Math.max(a,b);i>0;i--){
           if(a%i==0 && b%i==0){
            return i;
           }
        }
        return 1;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp = head;
        while(temp.next!=null){
            int gcd = findGcd(temp.val,temp.next.val);
            ListNode newNode = new ListNode(gcd,temp.next);
            temp.next = newNode;
            temp = temp.next.next;
        }
        return head;
    }
}