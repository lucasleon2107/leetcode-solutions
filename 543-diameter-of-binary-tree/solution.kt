// LeetCode 543: diameter-of-binary-tree

fun diameterOfBinaryTree(root: TreeNode?): Int {
    var result = 0

    fun dfs(current: TreeNode?): Int {
        if (current == null) return 0

        val left = dfs(current.left)
        val right = dfs(current.right)

        result = maxOf(result, left + right)

        return maxOf(left, right) + 1
    }

    dfs(root)

    return result
}