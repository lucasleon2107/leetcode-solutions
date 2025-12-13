// LeetCode 200: number-of-islands

fun numIslands(grid: Array<CharArray>): Int {
    var islands = 0

    fun dfs(i: Int, j: Int) {
        if (i !in grid.indices || j !in grid[0].indices || grid[i][j] != '1') {
            return
        }

        grid[i][j] = '0'

        dfs(i + 1, j)
        dfs(i - 1, j)
        dfs(i, j + 1)
        dfs(i, j - 1)
    }

    for (i in grid.indices) {
        for (j in grid[0].indices) {
            if (grid[i][j] == '1') {
                islands++
                dfs(i, j)
            }
        }
    }

    return islands
}