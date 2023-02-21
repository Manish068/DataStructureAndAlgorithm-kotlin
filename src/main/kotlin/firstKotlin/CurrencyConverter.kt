package firstKotlin

import java.util.Scanner

class CurrencyConverter {
    fun convertINRtoUSD(inr:Float):Float{
        return  inr/82.55f
    }
}

fun main(){
    println("Enter the rupee in INR")
    val reader = Scanner(System.`in`)
    val inr = reader.nextFloat()
    val obj = CurrencyConverter()
    println("INR to USD : ${obj.convertINRtoUSD(inr)}")
}