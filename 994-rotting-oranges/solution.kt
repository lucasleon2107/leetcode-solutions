// LeetCode 994: rotting-oranges

fun orangesRotting(grid: Array<IntArray>): Int {
    var freshOranges = 0
    val q = ArrayDeque<Pair<Int, Int>>()

    for (i in grid.indices) {
        for (j in grid[0].indices) {
            when (grid[i][j]) {
                1 -> freshOranges++
                2 -> q += i to j
            }
        }
    }

    if (freshOranges == 0) return 0

    var minutes = 0

    val directions = listOf(
        1 to 0,
        -1 to 0,
        0 to 1,
        0 to -1
    )

    while (q.isNotEmpty() && freshOranges > 0) {
        val size = q.size

        repeat(size) {
            val (x, y) = q.removeFirst()

            for ((i, j) in directions) {
                val nx = x + i
                val ny = y + j

                if (nx in grid.indices && ny in grid[0].indices && grid[nx][ny] == 1) {
                    q += nx to ny
                    freshOranges--
                    grid[nx][ny] = 2
                }
            }
        }

        minutes++
    }

    return if (freshOranges == 0) minutes else -1
}