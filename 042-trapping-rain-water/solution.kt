// LeetCode 42: trapping-rain-water

fun trap(height: IntArray): Int {
    if (height.isEmpty()) return 0

    var result = 0

    var left = 0
    var right = height.lastIndex

    var maxLeft = height[left]
    var maxRight = height[right]

    while (left < right) {
        if (maxLeft < maxRight) {
            left++
            maxLeft = maxOf(maxLeft, height[left])
            result += maxLeft - height[left]
        } else {
            right--
            maxRight = maxOf(maxRight, height[right])
            result += maxRight - height[right]
        }
    }

    return result
}