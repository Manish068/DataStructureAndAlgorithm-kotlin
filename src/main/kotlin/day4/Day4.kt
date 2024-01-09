package day4


class Day4 {
    //WAP to input a string and print the frequency of the characters
    fun frequencyOfCharacter() {
        val map = HashMap<Char, Int>()
        val str = "aabccy"
        var count = 0;
        for (s in str.toCharArray()) {
            if (map[s] == null) {
                count = 1
                map[s] = count
            } else {
                map[s] = ++count
            }
        }

        map.forEach { (ch, i) ->
            println("$ch : $i")
        }
    }

    //WAP to input a string and print the character with highest occurence
    fun highestOccurence() {
        val str = "aabbccyyyy"
        var char = str[0]
        var maxChar = str[0]
        var count = 1
        var maxCount = Integer.MIN_VALUE
        for (i in 1 until str.length) {
            if (char == str[i]) {
                count++
            } else {
                if (count > maxCount) {
                    maxCount = count
                    maxChar = char
                }
                char = str[i]
                count = 1
            }
        }

        if (count > maxCount) {
            println("$char : $count")
        } else {
            println("$maxChar : $maxCount")
        }
    }

    //WAP to reverse every word of string in proper manner
    fun reverseEveryWord() {
        val str = "this is my book"
        var strArray = str.split(" ")
        var reversedString = ""
        for (s in strArray) {
            reversedString += s.reversed() + " "
        }
        println(reversedString)
    }

    //Remove all duplicates from a given string
    fun removeAllDuplicates() {
        val str = "Java"
        val sb = StringBuilder()
        for (i in str.indices) {
            if (!sb.contains(str[i])) {
                sb.append(str[i])
            }
        }
        println(sb.toString())
    }

    fun restoreString(s: String, indices: Array<Int>): String {
//        val map = HashMap<Int,Char>()
//        for(i in s.indices){
//            map[indices[i]] = s[i]
//        }
//
//        var shuffle=""
//        map.toSortedMap().forEach { t, u ->
//            shuffle += u
//        }
//        return shuffle

        //2nd way
        var shuffle = CharArray(indices.size)
        for (i in indices.indices) {
            shuffle[indices[i]] = s[i]
        }


        return String(shuffle)
    }

    fun sortSentence(value: String) {
        var arr = value.split(" ")
        var res = Array(arr.size) { "" }
        for (i in 0 until arr.size) {
            val k = arr[i].length - 1
            val m = arr[i][k].code - '0'.code
            res[m - 1] = arr[i].substring(0, k)
        }

        val sb = StringBuilder()
        for (i in arr.indices) {
            sb.append(res[i] + " ")
        }

        println(sb.toString())
    }

    fun convertToTitle(columnNumber: Int) = StringBuilder().apply {
        var n = columnNumber
        while (n > 0) {
            println('A'.code)
            append('A' + --n % 26)
            n /= 26
        }
    }.reverse().toString()

    fun judgeCircle(moves: String): Boolean {
        var RL = 0
        var UD = 0
        for (m in moves.toCharArray()) {
            when (m) {
                'R' -> RL++
                'L' -> RL--
                'U' -> UD++
                else -> UD--
            }
        }
        return RL == 0 && UD == 0
    }

    fun freqAlphabets(s: String) {
        var index = 0
        val stringBuilder = StringBuilder()
        while (index < s.length) {
            index += if (index + 2 < s.length && s[index + 2] == '#') {
                val value = ("${s[index]}${s[index + 1]}").toInt()
                stringBuilder.append((value + 96).toChar())
                3
            } else {
                val value = ("${s[index]}").toInt()
                stringBuilder.append((value + 96).toChar())
                1
            }
        }
         println(stringBuilder.toString())
    }


}

fun main() {
    val obj = Day4()
    obj.frequencyOfCharacter()
    obj.highestOccurence()
    obj.reverseEveryWord()
    obj.removeAllDuplicates()

    val indices = arrayOf(4, 5, 6, 7, 0, 2, 1, 3)
    var s = "codeleet"
    println(obj.restoreString(s, indices))
    obj.sortSentence("is2 sentence4 This1 a3")
    println(obj.convertToTitle(27))
    obj.freqAlphabets("10#1")

}