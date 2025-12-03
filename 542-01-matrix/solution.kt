// LeetCode 542: 01-matrix

fun updateMatrix(mat: Array<IntArray>): Array<IntArray> {
    val distances = Array(mat.size) {
        IntArray(mat[0].size) {
            Int.MAX_VALUE
        }
    }

    val q = ArrayDeque<Pair<Int, Int>>()

    for (i in mat.indices) {
        for (j in mat[0].indices) {
            if (mat[i][j] == 0) {
                distances[i][j] = 0
                q += i to j
            }
        }
    }

    val directions = listOf(
        1 to 0,
        -1 to 0,
        0 to 1,
        0 to -1
    )

    while (q.isNotEmpty()) {
        val (x, y) = q.removeFirst()

        for ((i, j) in directions) {
            val nx = x + i
            val ny = y + j

            if (nx in mat.indices && ny in mat[0].indices && distances[nx][ny] > distances[x][y] + 1) {
                distances[nx][ny] = distances[x][y] + 1
                q += nx to ny
            }
        }
    }

    return distances
}