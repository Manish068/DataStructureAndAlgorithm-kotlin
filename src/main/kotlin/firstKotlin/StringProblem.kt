package firstKotlin

class StringProblem {
    fun decodeMessage(key: String, message: String) {

        val map = HashMap<Char,Char>()
        var char ='a'
        key.forEach {
            if (it != ' ' && map[it] == null){
                map[it] = char
                 ++char
            }
        }

        var encoded = ""
        message.forEach {
            encoded += if ( it == ' ')  ' ' else map[it]
        }


        println(encoded)
    }



}
fun main(){
    val obj = StringProblem()

    obj.decodeMessage("eljuxhpwnyrdgtqkviszcfmabo","zwx hnfx lqantp mnoeius ycgk vcnjrdb")
    val index = when("name") {
        "color" -> 1
        "type" -> 0
        else -> 2
    }
    val list = arrayOf(arrayOf("qqqq","qqqq","qqqq"),arrayOf("qqqq","qqqq","qqqq"),
        arrayOf("qqqq","qqqq","qqqq"),arrayOf("qqqq","qqqq","qqqq"),arrayOf("qqqq","qqqq","qqqq"),arrayOf("qqqq","qqqq","qqqq"),
        arrayOf("qqqq","qqqq","qqqq"))

    var count =0

    list.forEach {str->
        if (str[index]=="qqqq"){
            count++
        }
    }

    println(count)
}