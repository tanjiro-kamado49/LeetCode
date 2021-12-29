/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
            if(root==null) return null;
            LinkedList<Node>q=new LinkedList<>();
            q.add(root);
            while(q.isEmpty()!=true){
                    int size=q.size();
                    while(size>0){
                            Node cur=q.remove(0);
                            if(size==1){
                                    cur.next=null;
                            }
                            else{
                                    cur.next=q.get(0);
                            }
                            if(cur.left!=null){
                                    q.add(cur.left);
                            }
                            if(cur.right!=null){
                                    q.add(cur.right);
                            }
                            size--;
                    }
            }
         return root;
        
    }
}