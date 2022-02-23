/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
        HashMap<Node,Node>hm=new HashMap<>();
    public Node cloneGraph(Node node) {
            if(node==null) return null;
            if(hm.containsKey(node)){
                    return hm.get(node);
            }
            Node copy=new Node(node.val);
            hm.put(node,copy);
            for(int i=0;i<node.neighbors.size();i++){
                    copy.neighbors.add(cloneGraph(node.neighbors.get(i)));
            }
            return copy;
        
    }
}