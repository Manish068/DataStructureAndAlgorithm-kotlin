package StringProblems.Easy

import java.lang.StringBuilder
import java.util.*

class SortSentence {
    fun sortSentence(s: String): String {
        val array = s.split(" ")
        val emptyArray = Array<String>(array.size, init ={
            "0"
        })

        for(i in 0 until array.size){
            val k = array[i].length
            val m = array[i].substring(k-1,k).toInt()
            emptyArray[m-1] = array[i].substring(0,k-1)
        }

        val sb = StringBuilder()
        for (i in emptyArray.indices){
            if(i<emptyArray.size-1){
                sb.append(emptyArray[i]+" ")
            }else{
                sb.append(emptyArray[i])
            }
        }

        return sb.toString()
    }
}

fun main(){
    val obj = SortSentence()
    println(obj.sortSentence("Myself2 Me1 I4 and3"))
}