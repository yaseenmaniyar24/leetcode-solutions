class Solution {
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = getLeftHeight(root.left);
        int rightHeight = getLeftHeight(root.right);

        if (leftHeight == rightHeight) {
            // Left subtree is perfect binary tree of height leftHeight
            return (1 << leftHeight) + countNodes(root.right);
        } else {
            // Right subtree is perfect binary tree of height rightHeight
            return (1 << rightHeight) + countNodes(root.left);
        }
    }

    private int getLeftHeight(TreeNode node) {
        int height = 0;
        while (node != null) {
            height++;
            node = node.left;
        }
        return height;
    }
}