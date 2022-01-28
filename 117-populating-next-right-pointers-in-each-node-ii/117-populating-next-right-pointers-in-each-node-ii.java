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
            if(root==null) return root;
            Queue<Node>q=new ArrayDeque<>();
            q.add(root);
            while(q.isEmpty()==false){
                    int size=q.size();
                    Node prev=q.peek();
                    //System.out.println("prev- "+prev.val);
                    while(size>0){
                            Node cur=q.poll();
                            if(size==0){
                                    cur.next=null;
                                    
                            }
                             
                            if(prev!=cur){
                                   
                                    prev.next=cur;
                                    prev=cur;
                                    
                                    
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