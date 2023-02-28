package StringProblems.Easy

class HalvesStringAlike {
    fun halvesAreAlike(s: String): Boolean {
        var a  = s.substring(0,s.length/2)
        var b =s.substring(s.length/2,s.length);
        var countA=0;
        var countB=0;
        var vowels = "aeiouAEIOU"

       for (ch in a.toCharArray()){
           if(vowels.contains(ch)){
               countA++
           }
       }

        for (ch in b.toCharArray()){
            if(vowels.contains(ch)){
                countB++
            }
        }

        return countA==countB
    }
}

fun main(){
    val obj = HalvesStringAlike()
    println(obj.halvesAreAlike("tkPAdxpMfJiltOerItiv"))
}