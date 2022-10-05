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
     private void dfs(TreeNode root, int v, int level, int d) {
        if (root == null) return;
        if (level < d - 1) {
            dfs(root.left, v, level + 1, d);
            dfs(root.right, v, level + 1, d);
        } else {
            TreeNode t = root.left;
            root.left = new TreeNode(v);
            root.left.left = t;
            t = root.right;
            root.right = new TreeNode(v);
            root.right.right = t;
        }
        
    }
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        if (d == 1) {
            TreeNode newRoot = new TreeNode(v);
            newRoot.left = root;
            return newRoot;
        }
        dfs(root, v, 1, d);
        return root;
    }
}