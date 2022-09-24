class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> tmp = new LinkedList<>();
        dfs(root, sum, tmp, res);
        return res;
    }

    private void dfs(TreeNode node, int sum, List<Integer> tmp, List<List<Integer>> res) {
        if ( node == null ) return;
        
        tmp.add(node.val);
        if ( node.left == null && node.right == null && sum == node.val) {
            res.add(new LinkedList(tmp));
            tmp.remove(tmp.size() - 1);
            return;
        }
        
        
        dfs(node.left, sum - node.val, tmp, res);
        dfs(node.right, sum - node.val, tmp, res);
        tmp.remove(tmp.size()-1);
    }
}