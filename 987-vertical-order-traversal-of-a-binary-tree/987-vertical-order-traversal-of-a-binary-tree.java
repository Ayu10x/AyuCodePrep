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
   private TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map;
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        map = new TreeMap<>();
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        dfs(0, 0, root);
        for(TreeMap<Integer, PriorityQueue<Integer>> value : map.values()){
            List<Integer> temp = new ArrayList<>();
            for(PriorityQueue<Integer> pq : value.values()){
                while(!pq.isEmpty()){
                    temp.add(pq.poll());
                }
            }
            result.add(temp);
        }
        return result;
    }
    private void dfs(int x, int y, TreeNode node){
        TreeMap<Integer, PriorityQueue<Integer>> value = map.containsKey(x) ? map.get(x): new TreeMap<Integer, PriorityQueue<Integer>>(
            new Comparator<Integer>(){
                @Override
                public int compare(Integer n1, Integer n2){
                    return n2 - n1;
                }
            }
        );
        PriorityQueue<Integer> pq = value.containsKey(y) ? value.get(y): new PriorityQueue<Integer>();
        pq.offer(node.val);
        value.put(y, pq);
        map.put(x, value);
        if(node.left != null) dfs(x - 1, y - 1, node.left);
        if(node.right != null) dfs(x + 1, y - 1, node.right);
    }
}