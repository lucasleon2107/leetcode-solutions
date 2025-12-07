// LeetCode 102: binary-tree-level-order-traversal

fun levelOrder(root: TreeNode?): List<List<Int>> {
    val result = mutableListOf<MutableList<Int>>()

    if (root == null) return result

    val q = ArrayDeque<TreeNode>()
    q += root

    while (q.isNotEmpty()) {
        val size = q.size
        val level = mutableListOf<Int>()

        repeat(size) {
            val node = q.removeFirst()
            level += node.`val`
            node.left?.let { q += it }
            node.right?.let { q += it }
        }

        result += level
    }

    return result
}