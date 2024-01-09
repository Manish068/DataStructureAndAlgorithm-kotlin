package StringProblems.Easy

class NumberOfString {
    fun numOfStrings(patterns: Array<String>, word: String): Int {
        var count =0
        for(pattern in patterns){
            if(word.contains(pattern)){
                count++
            }
        }
        return count
    }
}
