package firstKotlin

import java.util.Scanner

//Take 2 numbers as input and print the largest number.
class GreatestNumber {
    fun findGreatestNumber(num1:Int,num2:Int):Int{
        return if (num1>num2) num1 else num2
    }
}

fun main(){
    println("Enter the first num1")
    val reader = Scanner(System.`in`)
    val num1 = reader.nextInt()
    println("Enter the first num2")
    val num2 = reader.nextInt()

    val obj = GreatestNumber()
    println("Greatest number in this two $num1 and $num2 is ${obj.findGreatestNumber(num1,num2)}")
}