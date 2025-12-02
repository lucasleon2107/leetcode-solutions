// LeetCode 57: insert-interval

fun insert(intervals: Array<IntArray>, newInterval: IntArray): Array<IntArray> {
    var newInterr = newInterval
    val result = mutableListOf<IntArray>()

    intervals.forEachIndexed { index, interval ->
        when {
            newInterr[1] < interval[0] -> {
                result += newInterr
                result += intervals.slice(index..intervals.lastIndex)
                return result.toTypedArray()
            }

            newInterr[0] > interval[1] -> {
                result += interval
            }

            else -> {
                newInterr = intArrayOf(
                    minOf(newInterr[0], interval[0]),
                    maxOf(newInterr[1], interval[1])
                )
            }
        }
    }

    result += newInterr
    return result.toTypedArray()
}