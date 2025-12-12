// LeetCode 155: min-stack

class MinStack() {
    val stack = ArrayDeque<Int>()
    val minStack = ArrayDeque<Int>()

    fun push(`val`: Int) {
        stack += `val`

        if (minStack.isEmpty()) {
            minStack += `val`
        } else {
            minStack += minOf(minStack.last(), `val`)
        }
    }

    fun pop() {
        stack.removeLast()
        minStack.removeLast()
    }

    fun top(): Int {
        return stack.last()
    }

    fun getMin(): Int {
        return minStack.last()
    }
}