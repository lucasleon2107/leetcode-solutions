// LeetCode 150: evaluate-reverse-polish-notation

fun evalRPN(tokens: Array<String>): Int {
    val stack = ArrayDeque<Int>()

    tokens.forEach { token ->
        when (token) {
            "+" -> {
                stack += stack.removeLast() + stack.removeLast()
            }

            "*" -> {
                stack += stack.removeLast() * stack.removeLast()
            }

            "-" -> {
                val first = stack.removeLast()
                val second = stack.removeLast()

                stack += second - first
            }

            "/" -> {
                val first = stack.removeLast()
                val second = stack.removeLast()

                stack += second / first
            }

            else -> stack += token.toInt()
        }
    }

    return stack.last()
}