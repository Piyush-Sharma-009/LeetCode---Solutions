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
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> li = new LinkedList<List<Integer>>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        if(root == null) return li;
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> subli = new LinkedList<Integer>();
            for(int i = 0;i<size;i++){
                if(q.peek().left!= null) q.offer(q.peek().left);
                if(q.peek().right!= null) q.offer(q.peek().right);
                subli.add(q.poll().val);
            }
            li.add(subli);
        }
        return li;
    }
}
