package StringProblems.Easy

class LongPressedName {
    //alex  aleex
    fun isLongPressedName(name: String, typed: String): Boolean {
        var i = 0;
        var j = 0;
        if (name[i] != typed[j]) {
            return false
        }

        if (name.length > typed.length) {
            return false
        }

        while (i < name.length && j < typed.length) {
            if (name[i] == typed[j]) {
                i++
                j++
            } else if (name[i - 1] == typed[j]) {

                j++

            } else {
                return false
            }
        }

        while (j<typed.length){
            if(name[i-1]==typed[j]){
                j++
            }else{
                return false
            }
        }

        if (i<name.length){
            return false
        }
        return true
    }
}