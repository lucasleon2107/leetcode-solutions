// LeetCode 208: implement-trie-prefix-tree

class TrieNode {
    val children = mutableMapOf<Char, TrieNode>()
    var endOfWord = false
}

class Trie() {
    val root = TrieNode()

    fun insert(word: String) {
        var current = root

        word.forEach { char ->
            if (char !in current.children) {
                current.children[char] = TrieNode()
            }

            current = current.children[char]!!
        }

        current.endOfWord = true
    }

    fun search(word: String): Boolean {
        var current = root

        word.forEach { char ->
            if (char !in current.children) {
                return false
            }

            current = current.children[char]!!
        }

        return current.endOfWord
    }

    fun startsWith(prefix: String): Boolean {
        var current = root

        prefix.forEach { char ->
            if (char !in current.children) {
                return false
            }

            current = current.children[char]!!
        }

        return true
    }
}