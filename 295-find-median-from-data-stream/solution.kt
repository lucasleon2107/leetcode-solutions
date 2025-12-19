// LeetCode 295: find-median-from-data-stream

class MedianFinder() {
    val lower = PriorityQueue<Int>(compareByDescending { it })
    val upper = PriorityQueue<Int>()

    fun addNum(num: Int) {
        if (lower.isEmpty() || num <= lower.peek()) {
            lower += num
        } else {
            upper += num
        }

        when {
            lower.size > upper.size + 1 -> upper += lower.poll()
            upper.size > lower.size -> lower += upper.poll()
        }
    }

    fun findMedian(): Double {
        if (lower.size == upper.size) {
            return (lower.peek().toLong() + upper.peek().toLong()) / 2.0
        } else {
            return lower.peek().toDouble()
        }
    }

}