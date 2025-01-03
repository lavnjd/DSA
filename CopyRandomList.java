class CopyRandomList {
    public Node copyRandomList(Node head) {
        Node temp = head;
        HashMap<Node,Node> mpp = new HashMap<>();
        while(temp != null){
            Node newNode = new Node(temp.val);
            mpp.put(temp, newNode);
            temp = temp.next;
        }
        temp = head;
        while(temp != null){
            Node copiedNode = mpp.get(temp);
            copiedNode.next = mpp.get(temp.next);
            copiedNode.random = mpp.get(temp.random);
            temp = temp.next;
        }
        return mpp.get(head);
    }
}