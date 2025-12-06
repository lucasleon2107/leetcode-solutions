// LeetCode 3: longest-substring-without-repeating-characters

fun lengthOfLongestSubstring(s: String): Int {
    val chars = mutableSetOf<Char>()
    var max = 0
    var left = 0

    s.forEachIndexed { right, char ->
        while (char in chars) {
            chars.remove(s[left])
            left++
        }

        chars += char

        max = maxOf(max, right - left + 1)
    }

    return max
}