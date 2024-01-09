package StringProblems.Easy

class ArrayStringEqual{
    fun arrayStringAreEqual(word1: Array<String>, word2: Array<String>): Boolean{
        var w1=""
        word1.forEach {
            w1 +=it
        }

        var w2 =""
        word2.forEach { it ->
            w2 +=it
        }

        return w1==w2
    }
}

