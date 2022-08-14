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
    public List<Integer> preorderTraversal(TreeNode root) {
  List<Integer> result = new ArrayList<>();
  preorder(root, result);
  return result;
}

private void preorder(TreeNode x, List<Integer> result) {
  if (x == null) {
    return;
  }
  result.add(x.val);
  preorder(x.left, result);
  preorder(x.right, result);
}
}