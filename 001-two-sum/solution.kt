// LeetCode 1: two-sum

fun twoSum(nums: IntArray, target: Int): IntArray {
    val diffMap = mutableMapOf<Int, Int>()

    nums.forEachIndexed { index, num ->
        val diff = target - num
        if (diff in diffMap) {
            return intArrayOf(index, diffMap[diff]!!)
        }
        diffMap += num to index
    }

    throw IllegalArgumentException()
}

