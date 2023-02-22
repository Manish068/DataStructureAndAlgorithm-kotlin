package firstKotlin

class AbhirupProblems {
    fun pos_gen(a: Int, b: Int, negative: Boolean): Boolean =
        if (negative)
            a < 0 && b < 0
        else
            (a < 0 && b > 0) || (a > 0 && b < 0)

    fun notString(value: String): String = if (value.startsWith("not")) value else "not $value"

    fun endString(value1: String,value2: String): Boolean {
        return if(value1.length>value2.length){
            windowProblem(value1.lowercase(),value2.lowercase())
        }else
            windowProblem(value2.lowercase(),value1.lowercase())
    }


    private fun windowProblem(value: String, key: String):Boolean {
        val m = value.length
        val n = key.length
        var lastOccur = -1
        for (windowStart in 0..m - n) {
            for (i in 0 until n) {
                if (value[windowStart + i] != key[i]) {
                    break
                }
                if (i == n - 1) {
                    lastOccur=windowStart
                    break
                }
            }
        }
        return lastOccur == m-n
    }

    fun left2(value: String):String {
        return if(value.length>=2){
            value.substring(2)+value.substring(0,2)
        }else
            ""
    }

    fun pangram(value: String):Boolean{
        var allLetterPresent = true
        for(ch in 'a' .. 'z'){
            if(!value.contains(ch)){
                allLetterPresent=false
                break
            }
        }
        return allLetterPresent
    }
}

fun main() {
    val obb = AbhirupProblems()
    println(obb.pos_gen(-4, -5, true))

    println(obb.notString("CandyMan"))
    println(obb.endString("abc","abcX"))
    println(obb.left2("java"))

    val pangramText = "Abcdefghijklmnopqrstuvwxy".lowercase()
    if(obb.pangram(pangramText)){
        println("Text is pangram")
    }else{
        println("Text is not pangram")
    }
}