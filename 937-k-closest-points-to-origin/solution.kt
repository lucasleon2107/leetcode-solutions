// LeetCode 937: k-closest-points-to-origin

fun kClosest(points: Array<IntArray>, k: Int): Array<IntArray> {
    val q = PriorityQueue<Pair<Int, Int>>(compareBy { it.second })

    points.forEachIndexed { index, point ->
        val distance = point[0] * point[0] + point[1] * point[1]
        q += index to distance
    }

    val result = mutableListOf<IntArray>()

    while (result.size < k) {
        result += points[q.poll().first]
    }

    return result.toTypedArray()
}