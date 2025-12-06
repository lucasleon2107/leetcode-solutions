// LeetCode 383: ransom-note

fun canConstruct(ransomNote: String, magazine: String): Boolean {
    val magFreq = mutableMapOf<Char, Int>()

    magazine.forEach { char ->
        magFreq += char to magFreq.getOrDefault(char, 0) + 1
    }

    ransomNote.forEach { char ->
        val freq = magFreq[char]

        if (freq == null || freq < 1) {
            return false
        }

        magFreq[char] = freq - 1
    }

    return true
}