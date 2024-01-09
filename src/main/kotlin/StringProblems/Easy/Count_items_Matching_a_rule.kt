package StringProblems.Easy

class Count_items_Matching_a_rule {
    fun countMatches(items: List<List<String>>, ruleKey: String, ruleValue: String): Int {
        val index = when(ruleKey){
            "type"-> 0
            "color"->1
            else -> 2
        }
        var count=0;
        items.forEach {value->
            if(value[index] == ruleValue){
                count++
            }
        }
        return count;
    }
}