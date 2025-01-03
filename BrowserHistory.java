class Node{
    String val;
    Node next;
    Node prev;
    public Node(String val) {
        this.val = val;
        this.next = null;
        this.prev = null;
    }
    public Node(String val, Node prev, Node next){
        this.val = val;
        this.prev = prev;
        this.next = next;
    }
    public Node(String val, Node prev){
        this.val = val;
        this.prev = prev;
        this.next = null;
    }
}
class BrowserHistory {

    Node currentPage;

    public BrowserHistory(String homepage) {
        currentPage = new Node(homepage);
    }
    
    public void visit(String url) {
        Node newPage = new Node(url);
        currentPage.next = newPage;
        newPage.prev = currentPage;
        currentPage = newPage;
    }
    
    public String back(int steps) {
        while(steps>0){
            if(currentPage.prev != null){
                currentPage = currentPage.prev;
            }
            else{
                break;
            }
            steps--;
        }
        return currentPage.val;
    }
    
    public String forward(int steps) {
        while(steps>0){
           if(currentPage.next != null){
            currentPage = currentPage.next;
           }else{
            break;
           }
           steps--;
        }
        return currentPage.val;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */