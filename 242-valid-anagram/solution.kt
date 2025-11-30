// LeetCode 242: valid-anagram

fun isAnagram(s: String, t: String): Boolean {
    val sMap = mutableMapOf<Char, Int>()

    s.forEach { char ->
        sMap += char to sMap.getOrDefault(char, 0) + 1
    }

    val tMap = mutableMapOf<Char, Int>()

    t.forEach { char ->
        tMap += char to tMap.getOrDefault(char, 0) + 1
    }

    return sMap == tMap
}