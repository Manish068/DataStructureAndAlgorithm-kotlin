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

    /*
    deeee
    0!=4 break

         */
    fun validPalindrome(s: String): Boolean {
        var i = 0;
        var j = s.length - 1
        while (i <= j) {
            if (s[i] != s[j]) {
               break;
            }
            i++
            j--
        }


        if(check(s,i+1,j) || check(s,i,j-1)){
            return true
        }
        return false

    }

    private fun check(s:String,i:Int,j:Int):Boolean{
        var i=i
        var j=j
        while (i<j){
            if(s[i]!=s[j])
                return false
            i++
            j--
        }
        return true
    }
}

fun main() {
    val obj = ValidPalindrome()
    println(obj.isPalindrome("A man, a plan, a canal: Panama"))
    println(obj.validPalindrome("deeee"))
}