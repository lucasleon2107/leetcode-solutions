// LeetCode 39: combination-sum

fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
    val result = mutableListOf<MutableList<Int>>()

    fun dfs(total: Int = 0, current: MutableList<Int> = mutableListOf(), index: Int = 0) {
        if (total == target) {
            result += current.toMutableList()
            return
        }

        if (total > target || index > candidates.lastIndex) return

        current.add(candidates[index])
        dfs(total + candidates[index], current, index)
        current.removeLast()
        dfs(total, current, index + 1)
    }

    dfs()

    return result
}