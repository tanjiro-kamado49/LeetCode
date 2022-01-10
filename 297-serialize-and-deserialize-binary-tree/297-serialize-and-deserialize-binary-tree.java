/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
            if(root==null){
                    return "[]";
            }
           List<String>lt=new ArrayList<>();
           Queue<TreeNode>q=new LinkedList<>();
           q.add(root);
            while(q.isEmpty()==false){
                    TreeNode cur=q.remove();
                    if(cur!=null){
                            lt.add(String.valueOf(cur.val));
                            q.add(cur.left);
                            q.add(cur.right);
                    }
                    else{
                            lt.add("#");
                    }
            }
            String res=String.join(",",lt);
            res="["+res+"]";
            return res;
            
        
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
            if(data==null ||data==""||data=="[]") return null;
            List<String>bfs=Arrays.asList(data.substring(1, data.length() - 1).split(","));
            List<TreeNode>node=new ArrayList<>();
            int parentInd=0;
            node.add(new TreeNode(Integer.parseInt(bfs.get(parentInd))));
            int childInd=1;
            while(parentInd<node.size() && childInd<bfs.size()){
                    TreeNode leftNode;
                    if(bfs.get(childInd).equals("#")){
                            leftNode=null;
                            
                    }
                    else{
                            leftNode=new TreeNode(Integer.parseInt(bfs.get(childInd)));
                            node.add(leftNode);
                    }
                    childInd++;
                    TreeNode rightNode;
                    if(bfs.get(childInd).equals("#")){
                            rightNode=null;
                            
                            
                    }
                    else{
                            rightNode=new TreeNode(Integer.parseInt(bfs.get(childInd)));
                            node.add(rightNode);
                    }
                    childInd++;
                    TreeNode parent=node.get(parentInd);
                    parentInd++;
                    parent.left=leftNode;
                    parent.right=rightNode;
            }
            return node.get(0);
        
            
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));