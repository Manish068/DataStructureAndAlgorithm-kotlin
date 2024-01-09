package StringProblems


class LongestCommonPrefix {


    companion object {
        val ALPHABET_SIZE = 26;
        lateinit var root: TrieNode
        var indexs: Int = 0
    }

    class TrieNode {
        var children = arrayOfNulls<TrieNode>(ALPHABET_SIZE)

        // isLeaf is true if the node represents
        // end of a word
        var isLeaf = false

        // constructor
        init {
            for (i in 0 until ALPHABET_SIZE) children[i] = null
        }
    };

    fun insert(key: String) {
        val length = key.length
        var index = 0
        var pCrawl = root
        for (level in 0 until length) {
            index = key[level].code - 'a'.code
            if (pCrawl.children[index] == null) {
                pCrawl.children[index] = TrieNode()
            }
            pCrawl = pCrawl.children[index]!!
        }

        pCrawl.isLeaf = true
    }

    fun countChildren(node: TrieNode): Int {
        var count = 0
        for (i in 0 until ALPHABET_SIZE) {
            if (node.children[i] != null) {
                count++
                indexs = i
            }
        }
        return count
    }

    fun walkTrie(): String {
        var pCrawl = root
        indexs = 0
        var prefix = ""
        while (countChildren(pCrawl) == 1 && !pCrawl.isLeaf
        ) {
            pCrawl = pCrawl.children[indexs]!!
            prefix += ('a' + indexs)
        }
        return prefix
    }

    fun constructTrie(arr: Array<String>, n: Int) {
        for (i in 0 until n) insert(arr[i])
        return
    }

    fun commonPrefix(arr: Array<String>, n: Int): String {
        root = TrieNode()
        constructTrie(arr, n)
        return walkTrie()
    }

}

fun main() {
    val arr = arrayOf(
        "geeksforgeeks", "geeks",
        "geek", "geezer"
    )
    val n = arr.size
    val obj = LongestCommonPrefix()

    val ans: String = obj.commonPrefix(arr, n)

    if (ans.length != 0) println("The longest common prefix is $ans") else println("There is no common prefix")
}