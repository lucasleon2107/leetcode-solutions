// LeetCode 238: product-of-array-except-self

fun productExceptSelf(nums: IntArray): IntArray {
    val result = IntArray(nums.size)
    var product = 1

    for (i in 0..nums.lastIndex) {
        result[i] = product
        product *= nums[i]
    }

    product = 1

    for (i in nums.lastIndex downTo 0) {
        result[i] *= product
        product *= nums[i]
    }

    return result
}