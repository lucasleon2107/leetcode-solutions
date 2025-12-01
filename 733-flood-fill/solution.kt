// LeetCode 733: flood-fill

fun floodFill(image: Array<IntArray>, sr: Int, sc: Int, color: Int): Array<IntArray> {
    val sourceColor = image[sr][sc]

    if (sourceColor == color) return image

    fun dfs(sr: Int, sc: Int) {
        if (sr !in image.indices || sc !in image[0].indices || image[sr][sc] != sourceColor) {
            return
        }

        image[sr][sc] = color

        dfs(sr + 1, sc)
        dfs(sr - 1, sc)
        dfs(sr, sc + 1)
        dfs(sr, sc - 1)
    }

    dfs(sr, sc)

    return image
}