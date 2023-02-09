package firstKotlin

//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

class SimpleInterest {

    /**
     *
     * @param principal principal (the initial amount of money)
     * @param time time (in years)
     * @param rate interest rate (as a decimal) and percentage
     * @return Interest
     * */

    fun interest(principal:Int,time:Int,rate:Double):Int{

        return (principal * time * (rate/100)).toInt()
    }
}

fun main(){
    val obj = SimpleInterest()
    val P =10000000
    val T=30
    val R = 7.6
    println("if you have a principal of $P, an interest rate of $R% per year, and a time period of $T years, then the simple interest would be ${obj.interest(P,T,R)}" )
}