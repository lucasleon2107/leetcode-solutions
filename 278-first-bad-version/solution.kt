// LeetCode 278: first-bad-version

fun firstBadVersion(n: Int): Int {
    var left = 1
    var right = n

    while (left <= right) {
        val mid = left + (right - left) / 2

        if (isBadVersion(mid)) {
            right = mid - 1
        } else {
            left = mid + 1
        }
    }

    return left
}