// LeetCode 67: add-binary

fun addBinary(a: String, b: String): String {
    var i = a.lastIndex
    var j = b.lastIndex
    var carry = 0

    val sb = StringBuilder()

    while (i >= 0 || j >= 0) {
        val bitA = if (i >= 0) a[i].digitToInt() else 0
        val bitB = if (j >= 0) b[j].digitToInt() else 0

        val total = bitA + bitB + carry
        sb.append(total % 2)
        carry = total / 2

        i--
        j--
    }

    if (carry == 1) sb.append('1')

    return sb.reversed().toString()
}