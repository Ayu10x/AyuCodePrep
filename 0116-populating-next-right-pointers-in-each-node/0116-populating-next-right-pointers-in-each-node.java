/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public static Node connect(Node root) {
        if (root == null || (root.left == null && root.right == null)) return root;

        connectNext(root.left, root.right);

        return root;
    }

    private static void connectNext(Node left, Node right) {
        if (left == null || right == null) return;
        left.next = right; // Step 1 - comments only for the image below!
		
        connectNext(left.left, left.right); // Step 2
        connectNext(left.right, right.left); // Step 3
        connectNext(right.left, right.right); // Step 4
    }
}