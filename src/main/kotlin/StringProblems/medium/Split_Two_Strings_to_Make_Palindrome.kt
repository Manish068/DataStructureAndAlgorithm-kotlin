package StringProblems.medium


//https://leetcode.com/problems/split-two-strings-to-make-palindrome/
class Split_Two_Strings_to_Make_Palindrome {
    fun checkPalindromeFormation(a: String, b: String): Boolean {
        for (i in 0 until a.length){
            var aPrefix = a.substring(0,i)
            var aSuffix = a.substring(i)
            var bPrefix = b.substring(0,i)
            var bSuffix = b.substring(0)

            val sb = StringBuilder()
            sb.append(aPrefix).append(bSuffix)

            if(checkPalindrome(sb.toString())){
                return true
            }
            sb.setLength(0)
            sb.append(bPrefix).append(aSuffix)
            if (checkPalindrome(sb.toString())){
                return true
            }
        }
        return false
    }

    private fun checkPalindrome(str: String): Boolean {
        println(str)
        var i = 0;
        var j = str.length
        while (i < j) {
            if (str[i] != str[j - 1]) {
                return false
            }
            i++
            j--
        }
        return true
    }

}

fun main(){
    val obj = Split_Two_Strings_to_Make_Palindrome()
    println(obj.checkPalindromeFormation("ulacfd","jizalu"))
}