package firstKotlin

class FirstOccurrenceString {
    fun firstOccurrence(): Int {
        val hayStack = "butsad"
        val needle = "sad"
        var m = hayStack.length
        var n = needle.length

        for(windowStart in 0 .. m-n){
            for (i in 0 .. n){
                if(hayStack[windowStart+i]!=needle[i]){
                    break
                }
                if(i==n-1){
                    return windowStart
                }
            }
        }
        return -1
    }
}
fun main(){
    val obj  = FirstOccurrenceString()
    println(obj.firstOccurrence())
}