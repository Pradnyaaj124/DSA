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
    public boolean isSameTree(TreeNode p, TreeNode q) {

        // Case 1: Both nodes are null
        if (p == null && q == null) {
            return true;
        }

        // Case 2: Only one node is null
        if (p == null || q == null) {
            return false;
        }

        // Case 3: Values are different
        if (p.val != q.val) {
            return false;
        }

        // Case 4: Check left and right subtrees
        return isSameTree(p.left, q.left) &&
               isSameTree(p.right, q.right);
    }
}