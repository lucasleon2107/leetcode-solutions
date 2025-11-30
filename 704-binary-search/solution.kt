// LeetCode 704: binary-search

fun search(nums: IntArray, target: Int): Int {
    var left = 0
    var right = nums.lastIndex

    while (left <= right) {
        val mid = left + (right - left) / 2

        if (target == nums[mid]) {
            return mid
        }

        if (target < nums[mid]) {
            right = mid - 1
        } else if (target > nums[mid]) {
            left = mid + 1
        }
    }

    return -1
}