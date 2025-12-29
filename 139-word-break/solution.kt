// LeetCode 139: word-break

fun wordBreak(s: String, wordDict: List<String>): Boolean {
    val n = s.length
    val dp = BooleanArray(n + 1)
    dp[n] = true

    for (i in s.indices.reversed()) {
        for (word in wordDict) {
            val wordLen = word.length

            if (i + wordLen <= n && s.startsWith(word, i)) {
                dp[i] = dp[i + wordLen]
                if (dp[i]) break
            }
        }
    }

    return dp[0]
}