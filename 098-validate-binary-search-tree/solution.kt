// LeetCode 98: validate-binary-search-tree

fun isValidBST(root: TreeNode?): Boolean {
    fun isValid(root: TreeNode?, left: Long = Long.MIN_VALUE, right: Long = Long.MAX_VALUE): Boolean {
        if (root == null) return true
        if (!(root.`val` > left && root.`val` < right)) return false

        return isValid(root.left, left, root.`val`.toLong()) && isValid(root.right, root.`val`.toLong(), right)
    }

    return isValid(root)
}