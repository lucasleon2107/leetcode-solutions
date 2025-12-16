// LeetCode 236: lowest-common-ancestor-of-a-binary-tree

fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
    if (root == null || p == null || q == null) return null

    if (root.`val` == p.`val` || root.`val` == q.`val`) return root

    val left = lowestCommonAncestor(root.left, p, q)
    val right = lowestCommonAncestor(root.right, p, q)

    return when {
        left != null && right != null -> root
        left != null -> left
        right != null -> right
        else -> null
    }
}