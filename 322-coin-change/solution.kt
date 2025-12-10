// LeetCode 322: coin-change

fun coinChange(coins: IntArray, amount: Int): Int {
    val dp = IntArray(amount + 1) { amount + 1 }

    dp[0] = 0

    for (i in 1..amount) {
        for (coin in coins) {
            if (coin <= i) {
                dp[i] = minOf(dp[i], dp[i - coin] + 1)
            }
        }
    }

    return if (dp[amount] > amount) {
        -1
    } else {
        return dp[amount]
    }
}