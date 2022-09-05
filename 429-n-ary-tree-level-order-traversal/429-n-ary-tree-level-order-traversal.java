/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

//left to right level by level
//USING DFS
class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        
        DFS(root, ans, 1); // passing the root, list and the depth
        
        return ans;
    }
    
    private void DFS(Node root, List<List<Integer>> ans, int depth){
        
        //Base Case
        if(root == null) return;
        
        //Add the row when we first reach the level
        if(ans.size() < depth){
            ans.add(new ArrayList<>());
        }
        
        ans.get(depth-1).add(root.val);
        
        //Traverse Children
        for(Node child : root.children){
            DFS(child, ans, depth + 1);
        }
    }
}