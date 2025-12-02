// LeetCode 235: lowest-common-ancestor-of-a-binary-search-tree

fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
    if (root == null || p == null || q == null) {
        return null
    }

    val rVal = root.`val`
    val pVal = p.`val`
    val qVal = q.`val`

    return when {
        pVal > rVal && qVal > rVal -> lowestCommonAncestor(root.right, p, q)
        pVal < rVal && qVal < rVal -> lowestCommonAncestor(root.left, p, q)
        else -> root
    }
}