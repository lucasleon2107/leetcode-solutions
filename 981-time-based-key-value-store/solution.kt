// LeetCode 981: time-based-key-value-store

class TimeMap() {
    val store = mutableMapOf<String, MutableList<Pair<String, Int>>>()

    fun set(key: String, value: String, timestamp: Int) {
        store.getOrPut(key) {
            mutableListOf()
        } += value to timestamp
    }

    fun get(key: String, timestamp: Int): String {
        val list = store[key] ?: return ""

        var left = 0
        var right = list.lastIndex
        var result = ""

        while (left <= right) {
            val mid = left + (right - left) / 2

            val (currentValue, currentTimestamp) = list[mid]

            if (currentTimestamp == timestamp) return currentValue

            if (currentTimestamp < timestamp) {
                result = currentValue
                left = mid + 1
            } else {
                right = mid - 1
            }
        }

        return result
    }

}