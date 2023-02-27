package StringProblems.Easy

class ShuffleString {
    fun shuffleString(s:String, indices: List<Int>): String {
        val res = CharArray(indices.size)
        for(i in indices.indices){
            res[indices[i]] = s[i]
        }
        return String(res)
    }
}

fun main(){
    val obj = ShuffleString()
    val s = "codeleet"

    val list = listOf(4,5,6,7,0,2,1,3)
    println(obj.shuffleString("codeleet",list))

}