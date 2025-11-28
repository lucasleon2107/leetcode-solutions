// LeetCode 121: best-time-to-buy-and-sell-stock

fun maxProfit(prices: IntArray): Int {
    var maxProfit = 0
    var buyDay = 0
    var sellDay = 1

    while(sellDay < prices.size) {
        if(prices[sellDay] > prices[buyDay]) {
            val profit = prices[sellDay] - prices[buyDay]
            maxProfit = maxOf(maxProfit, profit)
        } else {
            buyDay = sellDay
        }

        sellDay++
    }

    return maxProfit
}