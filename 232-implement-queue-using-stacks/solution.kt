// LeetCode 232: implement-queue-using-stacks

class MyQueue() {
    val stack1 = ArrayDeque<Int>()
    val stack2 = ArrayDeque<Int>()

    fun push(x: Int) {
        stack1 += x
    }

    fun pop(): Int {
        if (stack2.isEmpty()) {
            transfer()
        }

        return stack2.removeLast()
    }

    fun peek(): Int {
        if (stack2.isEmpty()) {
            transfer()
        }

        return stack2.last()
    }

    fun empty(): Boolean {
        return stack1.isEmpty() && stack2.isEmpty()
    }

    private fun transfer() {
        while (stack1.isNotEmpty()) {
            stack2 += stack1.removeLast()
        }
    }
}