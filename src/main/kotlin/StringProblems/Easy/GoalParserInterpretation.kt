package StringProblems.Easy

class GoalParserInterpretation {
    fun interpret(command: String): String {
        var i=0;
        var sum=""
        while (i<command.length){
            if(command[i]=='(' && command[i+1] ==')'){
                sum += "o"
            }else if (command[i]=='(' && command[i+1] =='a' && command[i+2]=='l' && command[i+3] ==')'){
                sum += "al"
            }else if (command[i]=='G'){
                sum+="G"
            }
            i++
        }
        return  sum
    }
}
fun main(){
    val obj = GoalParserInterpretation()
    println(obj.interpret("G()(al)"))
}