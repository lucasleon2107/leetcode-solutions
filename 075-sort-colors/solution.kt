// LeetCode 75: sort-colors

fun sortColors(nums: IntArray): Unit {
    var zero = 0
    var one = 0

    nums.forEach { num ->
        when (num) {
            0 -> zero++
            1 -> one++
        }
    }

    nums.indices.forEach { index ->
        when {
            zero > 0 -> {
                nums[index] = 0
                zero--
            }

            one > 0 -> {
                nums[index] = 1
                one--
            }

            else -> {
                nums[index] = 2
            }
        }
    }
}
