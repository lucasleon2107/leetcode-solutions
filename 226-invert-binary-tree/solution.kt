// LeetCode 226: invert-binary-tree

fun invertTree(root: TreeNode?): TreeNode? {
    if (root == null) return null

    var temp = root.left
    root.left = root.right
    root.right = temp

    invertTree(root.left)
    invertTree(root.right)

    return root
}