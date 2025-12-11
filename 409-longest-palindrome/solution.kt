// LeetCode 409: longest-palindrome

fun longestPalindrome(s: String): Int {
    val odd = mutableSetOf<Char>()
    var pairs = 0

    s.forEach { char ->
        if (!odd.add(char)) {
            odd.remove(char)
            pairs++
        }
    }

    return pairs * 2 + if (odd.isNotEmpty()) 1 else 0
}