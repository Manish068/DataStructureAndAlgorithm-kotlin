package firstKotlin

import java.util.*
import kotlin.collections.HashMap
import kotlin.math.abs

class AbhirupProblemsDay2 {
    //print the number of times that substring occurs in the given string
    private var reader: Scanner = Scanner(System.`in`)
    fun printNumberOfSubstringOccur() {
        println("Enter the string")
        val value = reader.next().uppercase()
        println("Enter the substring to find")
        val key = reader.next().uppercase()

        println("The total occurence of $key in $value is : ${windowSlide(value, key)}")
    }

    fun windowSlide(value: String, key: String): Int {
        val m = value.length
        val n = key.length
        var countOccur = 0
        for (windowStart in 0..m - n) {
            for (i in 0 until n) {
                if (value[windowStart + i] != key[i]) {
                    break;
                }

                if (i == n - 1) {
                    countOccur++
                }
            }
        }
        return countOccur
    }

    //Determine the number of words in string which follows camelcase
    fun numberOfWords() {
        println("Enter the string")
        val value = reader.next()
        var count = 1
        for (s in value.toCharArray()) {
            if (s.isUpperCase()) {
                count++
            }
        }

        println("The total number of words in $value is $count")
    }

    //find the minimum number of characters that must be deleted to make them anagrams


    fun anagrams(){
        val str1 = "abc"
        val str2 = "amnop"

        val CHARS = 26
        val arr = IntArray(CHARS)
        for (s in str1){
            arr[s.code - 'a'.code]++
        }

        for (s in str2){
            arr[s.code - 'a'.code]--
        }

        var ans =0;
        for (i in 0 until CHARS){
            ans += abs(arr[i])
        }

        println("The number of word deleted to make anagram is $ans")
    }

    //Reduce a string
    fun reduceString(){
        val str  = StringBuilder("aaabccddd")
        var c =0
        while (c<str.length-1){
            if(str[c]==str[c+1]){
                str.delete(c,c+2)
                c=0
            }else{
                c++
            }
        }

        if (str.isEmpty()){
            println("Empty String")
        }else{
            println(str.toString())
        }

    }

    //A weighted string
    fun weightedString(){
        val str = "zzzz"
        val map = HashMap<Char,Int>()
        var i=1;
        for(ch in 'a' .. 'z'){
            map[ch] = i
            i++
        }
        var w = 0
        for(s in str.toCharArray()){
            w += map[s]!!
        }

        println(w)
    }

}

fun main() {
    val obj = AbhirupProblemsDay2()
//    obj.printNumberOfSubstringOccur()
//    obj.numberOfWords()
//    obj.anagrams()
//    obj.reduceString()
    obj.weightedString()


}