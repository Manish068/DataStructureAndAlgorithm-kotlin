package StringProblems.Easy

class FindOccurence {

    //Window problem
    fun strStr(haystack: String, needle: String): Int {
        var m = haystack.length
        var n = needle.length

        for (windowStart in 0 ..  m-n){
            for( j in 0 until n){
                if(haystack[windowStart+j]!=needle[j]){
                    return break
                }
                if(j == n-1){
                    return windowStart
                }
            }
        }
        return -1;
    }

    //Two pointer solution
    fun twoPointerstrStrSolution(haystack: String, needle: String): Int{
        val nl = needle.length
        var i=0
        var j = i+nl
        if(nl == haystack.length){
            if (needle.equals(haystack)){
                return 0
            }
        }else if(nl>haystack.length){
            return -1
        }

        while (j<=haystack.length){
            if(needle.equals(haystack.substring(i,j))){
                return i
            }
            i++
            j++
        }
        return -1;
    }
}

fun main(){
    val obj = FindOccurence()
    println(obj.strStr("a","a"))
}