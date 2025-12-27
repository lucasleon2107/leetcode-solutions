// LeetCode 75: sort-colors

fun sortColors(nums: IntArray): Unit {
    fun swap(left: Int, right: Int) {
        val temp = nums[left]
        nums[left] = nums[right]
        nums[right] = temp
    }

    var left = 0
    var right = nums.lastIndex
    var i = 0

    while (i <= right) {
        if (nums[i] == 0) {
            swap(left, i)
            left++
        } else if (nums[i] == 2) {
            swap(i, right)
            right--
            i--
        }

        i++
    }
}
