class Flatten {
    // Function to flatten a linked list
    public static void SortIt(Node parent,Node ans){
        if(ans.data>=parent.data){
            parent.bottom = ans;
        }else{
            Node t = ans;
            while(t.bottom!=null && t.bottom.data<parent.data){
                t=t.bottom;
            }
            parent.bottom = t.bottom;
            t.bottom = parent;
        }
    }
    Node flatten(Node root) {
        // code here
        Node result = new Node(0);
        Node ans = result;
        Node temp = root;
        while(temp != null){
            Node nextNode = temp.next;
            temp.next = null;
            Node parent = temp;
            while(parent != null){
                Node bottomNode = parent.bottom;
                SortIt(parent,ans);
                parent = bottomNode;
            }
            temp = nextNode;
        }
        

        return result.bottom;
    }
}