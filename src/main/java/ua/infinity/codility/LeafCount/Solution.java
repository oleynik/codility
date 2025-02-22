package ua.infinity.codility.LeafCount;

/**
 * @author Alex Oliinyk
 */
public class Solution {

    public int solution(TreeNode<?> tree) {
        if (tree == null) {
            return 0;
        }
        if (tree.left == null && tree.right == null) {
            return 1;
        }
        return solution(tree.left) + solution(tree.right);
    }
}
