package allAboutArray.easy

import allAboutArray.basic.BasicOfArray

class KadaneAlgorithm {

    //Maximum subArray Sum
    fun solution():Int{
        val arr = intArrayOf(1,2,3,-2,5)
        var max = Integer.MIN_VALUE
        var sum=0
        for (element in arr){
            sum += element
            if (sum>max){
                max=sum
            }
            if(sum<0) sum=0
        }
        return max
    }
}