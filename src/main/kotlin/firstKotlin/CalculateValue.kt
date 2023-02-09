package firstKotlin

import java.util.Scanner

class CalculateValue {
    fun add(num1:Int,num2:Int) = num1+num2

    fun subtract(num1: Int,num2: Int) = num2-num1

    fun multiply(num1: Int,num2: Int) =num1*num2

    fun divide(num1: Int,num2: Int) = num1/num2
}

fun main(){
    val reader = Scanner(System.`in`)


    println("Choose operator (+, -, *, /) for exit press 0")

    val obj = CalculateValue()
    while (true){
        println("Enter number 1")
        val num1 = reader.nextInt()
        println("Enter number 2")
        val num2 = reader.nextInt()
        println("Enter operator")
        when(reader.next()){
            "+" -> {
                println("Addition of two number $num1 and $num2 is ${obj.add(num1,num2)}")
            }
            "-" -> {
                println("Subtraction of two number $num1 and $num2 is ${obj.subtract(num1,num2)}")
            }
            "*" -> {
                println("Multiplication of two number $num1 and $num2 is ${obj.multiply(num1,num2)}")
            }
            "/" ->{
                println("Division of two number $num1 and $num2 is ${obj.divide(num1,num2)}")
            }
            else ->{
                break;
            }
        }
    }

}