// LeetCode 110: balanced-binary-tree

fun isBalanced(root: TreeNode?): Boolean {
    if(root == null) {
        return true
    }

    return abs(getHeight(root.left) - getHeight(root.right)) < 2 && isBalanced(root.left) && isBalanced(root.right)
}

fun getHeight(root:TreeNode?): Int {
    if(root == null) {
        return 0
    }

    return maxOf(getHeight(root.left), getHeight(root.right)) + 1
}