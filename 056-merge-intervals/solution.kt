// LeetCode 56: merge-intervals

fun merge(intervals: Array<IntArray>): Array<IntArray> {
    val sortedIntervals = intervals.sortedBy { it[0] }
    val result = mutableListOf(sortedIntervals[0])

    for (i in 1..sortedIntervals.lastIndex) {
        val (start, end) = sortedIntervals[i]

        val lastEnd = result.last()[1]

        if (lastEnd >= start) {
            result.last()[1] = maxOf(lastEnd, end)
        } else {
            result += sortedIntervals[i]
        }
    }

    return result.toTypedArray()
}