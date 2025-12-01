// LeetCode 53: maximum-subarray

fun maxSubArray(nums: IntArray): Int {
    var max = nums[0]
    var sum = 0

    nums.forEach { num ->
        if (sum < 1) {
            sum = 0
        }

        sum += num

        max = maxOf(max, sum)
    }

    return max
}