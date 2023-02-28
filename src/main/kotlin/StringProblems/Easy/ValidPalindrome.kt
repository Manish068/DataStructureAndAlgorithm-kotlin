package StringProblems.Easy

import java.util.*

class ValidPalindrome {
    fun isPalindrome(s: String): Boolean {
        var i = 0
        val re = Regex("[^a-zA-Z0-9]")
        var newstr = re.replace(s, "").lowercase()
        var j = newstr.length - 1

        while (i <= j) {
            if (newstr[i] != newstr[j]) {
                return false
            }
            i++
            j--
        }
        return true
    }
}

fun main() {
    val obj = ValidPalindrome()
    println(obj.isPalindrome("A man, a plan, a canal: Panama"))
}