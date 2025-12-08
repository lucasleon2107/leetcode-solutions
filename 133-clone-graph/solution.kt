// LeetCode 133: clone-graph

fun cloneGraph(node: Node?): Node? {
    val cloneMap = mutableMapOf<Node, Node>()

    fun clone(node: Node?): Node? {
        if (node == null) return null
        if (node in cloneMap) return cloneMap[node]

        val copy = Node(node.`val`)
        cloneMap += node to copy

        node.neighbors.forEach { neighbor ->
            copy.neighbors += clone(neighbor)
        }

        return copy
    }

    return clone(node)
}