// LeetCode 169: majority-element

fun majorityElement(nums: IntArray): Int {
    var candidate = 0
    var counter = 0

    nums.forEach { num ->
        if (counter == 0) {
            candidate = num
        }

        if (candidate == num) {
            counter++
        } else {
            counter--
        }
    }

    return candidate
}