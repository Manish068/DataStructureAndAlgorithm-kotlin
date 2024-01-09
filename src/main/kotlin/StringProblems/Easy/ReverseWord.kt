package StringProblems.Easy;

class ReverseWord {
    fun reverseWord(s:String):String{
        var arr = s.split(" ")
        var r = StringBuilder()
        for(c in arr){
            r.append(c.reversed()+" ")
        }

        return r.toString().trim()
    }
}

fun main(){
    val obj = ReverseWord()
    println(obj.reverseWord("Let's take LeetCode contest"))
}
