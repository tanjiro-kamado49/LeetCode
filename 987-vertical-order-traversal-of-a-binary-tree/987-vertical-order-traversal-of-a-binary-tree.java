/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class tuple{
    TreeNode node;
    int row;
    int col;
    tuple(TreeNode node,int row,int col){
        this.node=node;
        this.row=row;
        this.col=col;
    }
}
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>>ans=new ArrayList<>();
        Map<Integer,TreeMap<Integer,PriorityQueue<Integer>>>map=new  TreeMap<>();
        Queue<tuple>q=new LinkedList<>();
        if(root==null) return ans;
        q.offer(new tuple(root,0,0));
        while(!q.isEmpty()){
            tuple temp=q.remove();
            int x=temp.row;
            int y=temp.col;
            TreeNode node=temp.node;
            if(map.containsKey(x)==false){
                map.put(x,new TreeMap<>());
            }
            if(map.get(x).containsKey(y)==false){
                map.get(x).put(y,new PriorityQueue<Integer>());
            }
            map.get(x).get(y).offer(node.val);
            if(node.left!=null){
                tuple t=new tuple(node.left,x-1,y+1);
                q.offer(t);
            }
            if(node.right!=null){
                tuple t=new tuple(node.right,x+1,y+1);
                q.offer(t);
            }
        }
        for(TreeMap<Integer,PriorityQueue<Integer>>ys:  map.values()){
            ans.add(new ArrayList<>());
            for(PriorityQueue<Integer> nn:ys.values()){
                while(!nn.isEmpty())
                   ans.get(ans.size()-1).add(nn.poll());
            }
        }
        return ans;
        
        
    }
}