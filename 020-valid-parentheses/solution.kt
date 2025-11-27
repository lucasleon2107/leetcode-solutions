// LeetCode 20: valid-parentheses

fun isValid(s: String): Boolean {
    val stack = ArrayDeque<Char>()
    val bracketMap = mapOf(
        ')' to '(',
        ']' to '[',
        '}' to '{'
    )

    s.forEach { char ->
        when (char) {
            ')', ']', '}' -> {
                val last = stack.removeLastOrNull()

                if (last == null || bracketMap[char] != last) {
                    return false
                }
            }

            else -> stack += char
        }
    }

    return stack.isEmpty()
}
