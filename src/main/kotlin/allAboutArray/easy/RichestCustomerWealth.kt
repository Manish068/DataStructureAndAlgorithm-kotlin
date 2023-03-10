package allAboutArray.easy

class RichestCustomerWealth {

    fun maximumWealth(accounts: Array<IntArray>): Int {
        var max = Integer.MIN_VALUE
        for (i in accounts){
            var sum=0
            for (j in i){
                sum += j
            }
            if(sum>max){
                max = sum
            }
        }
        return  max
    }
}