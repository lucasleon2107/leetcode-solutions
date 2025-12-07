// LeetCode 15: 3sum

fun threeSum(nums: IntArray): List<List<Int>> {
    val result = mutableListOf<List<Int>>()
    nums.sort()

    for (i in nums.indices) {
        val a = nums[i]

        if (i > 0 && a == nums[i - 1]) {
            continue
        }

        var left = i + 1
        var right = nums.lastIndex

        while (left < right) {
            val sum = a + nums[left] + nums[right]

            when {
                sum > 0 -> right--
                sum < 0 -> left++
                else -> {
                    result += listOf(a, nums[left], nums[right])
                    left++

                    while (left < right && nums[left] == nums[left - 1]) {
                        left++
                    }
                }
            }
        }
    }

    return result
}