package firstKotlin

import java.util.Scanner

class StringPalindrome {
    fun checkPalindrome(inputString:String):Boolean{
        var i=0;
        var j = inputString.length
        while (i<j){
            if(inputString[i] != inputString[j-1]){
                return false;
            }
            i++
            j--
        }
        return true
    }

    fun checkPalindrome(num:Int):Boolean{
        var num = num
        val orginalNum = num
        var reverseNum =0
        while (num!=0){
            val remainder = num%10
            reverseNum = reverseNum * 10 + remainder
            num /= 10
        }

        return orginalNum==reverseNum
    }
}

fun main(){
    val reader = Scanner(System.`in`)
    val input = reader.nextInt()
    val obj = StringPalindrome()
    if(obj.checkPalindrome(input)){
        println("$input is palindrome")
    }else{
        println("$input is not palindrome")
    }
}

