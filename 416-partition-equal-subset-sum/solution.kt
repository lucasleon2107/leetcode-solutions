// LeetCode 416: partition-equal-subset-sum

fun canPartition(nums: IntArray): Boolean {
    val totalSum = nums.sum()

    if (totalSum % 2 != 0) return false

    var dp = mutableSetOf(0)

    val target = totalSum / 2

    for (num in nums) {
        val nextDp = mutableSetOf<Int>()
        for (t in dp) {
            if (t + num == target) return true
            nextDp += t
            nextDp += t + num
        }
        dp = nextDp
    }

    return target in dp
}