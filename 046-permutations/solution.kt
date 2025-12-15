// LeetCode 46: permutations

fun permute(nums: IntArray): List<List<Int>> {
    val result = mutableListOf<List<Int>>()
    val used = BooleanArray(nums.size)

    fun dfs(current: MutableList<Int> = mutableListOf()) {
        if (current.size == nums.size) {
            result += current.toList()
            return
        }

        for (i in nums.indices) {
            if (used[i]) continue
            used[i] = true
            current += nums[i]

            dfs(current)

            current.removeLast()
            used[i] = false
        }
    }

    dfs()
    return result
}