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
    public int maxDepth(TreeNode root) {
        if(root == null)  return 0;
        List<List<Integer>> wraplist = new ArrayList<>();
        Queue<TreeNode> qu = new LinkedList<>();

        qu.offer(root);

        while(!qu.isEmpty()){
            int levelNum = qu.size();
            ArrayList<Integer> sublist = new ArrayList<>();
            for(int i = 0;i<levelNum;i++){
                if(qu.peek().left != null) qu.offer(qu.peek().left);
                if(qu.peek().right != null) qu.offer(qu.peek().right);
            sublist.add(qu.poll().val);
            }
            wraplist.add(sublist);
        }
        return wraplist.size();
    }
}
