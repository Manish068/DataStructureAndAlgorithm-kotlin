package firstKotlin

import java.util.Scanner

class BasicProgramConditionAndLoop {
    private var reader: Scanner

    init {
        reader = Scanner(System.`in`)
    }

    //Calculate CGPA Program?
    fun calculateCGPA(): Float {
        reader = Scanner(System.`in`)
        println("Please enter the number of subject")
        var numOfSubject = reader.nextInt()
        val marks = mutableListOf<Int>()
        var i = 1;
        while (numOfSubject > 0) {
            println("Enter the marks of subject ${i++}")
            marks.add(reader.nextInt())
            numOfSubject--
        }
        //gradePoints
        var GP = 0;
        for (mark in marks) {
            GP += mark
        }

        return (GP.toFloat() / marks.size.toFloat())
    }

    //Find if a number is palindrome or not
    fun numberPalindrome() {
        println("Enter number")
        var num = reader.nextInt()
        val ogNum = num
        var retNum = 0
        while (num != 0) {
            val remainder = num % 10 //take the last digit
            retNum = retNum * 10 + remainder
            num /= 10
        }

        if (ogNum == retNum) {
            println("$ogNum is Palindrome")
        } else {
            println("$ogNum is not Palindrome")
        }
    }

    //Sum Of A Digits Of Number?
    fun sumOfDigits(): Int {
        println("Enter number")
        var num = reader.nextInt()
        val ogNum = num
        var sum = 0
        while (num != 0) {
            val remainder = num % 10
            sum += remainder
            num /= 10
        }
        println("Sum of all $ogNum is $sum")
        return sum
    }

    /**
    print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers
    from a list of numbers (N) entered by the user.
    The list terminates when the user enters a zero.
     */

    fun printSumOfNegAndPos() {
        val list = mutableListOf<Int>()
        while (true) {
            println("Enter num")
            val num = reader.nextInt()
            if (num != 0)
                list.add(num)
            else
                break
        }
        print("positive Even number: ")
        list.forEach {
            if (it > 0 && it % 2 == 0) {
                print("$it ")
            }
        }
        println()
        print("positive Odd number: ")
        list.forEach {
            if (it > 0 && it % 2 != 0) {
                print("$it ")
            }
        }

        var sumOfNegative = 0;
        var sumOfPositive = 0;
        for (i in list) {
            if (i > 0) {
                if (i % 2 == 0) {
                    sumOfPositive += i
                } else
                    sumOfNegative += i
            }
        }

        println("The sum of positive number : $sumOfPositive")
        println("The sum of negative number : $sumOfNegative")
    }

    //Subtract the Product and Sum of Digits of an Integer
    fun subtractProductAndSumDigit(){
        val result = productOfDigits() - sumOfDigits()
        println(result)
    }
    //Product Of A Digits Of Number?
    fun productOfDigits(): Int {
        println("Enter number")
        var num = reader.nextInt()
        val ogNum = num
        var sum = 1
        while (num != 0) {
            val remainder = num % 10
            sum *= remainder
            num /= 10
        }
        println("Product of all $ogNum is $sum")
        return sum
    }

}

fun main() {
    val obj = BasicProgramConditionAndLoop()
//    println("Total CGPA ${obj.calculateCGPA()}")
//    obj.numberPalindrome()
//     obj.sumOfDigits()
//    obj.printSumOfNegAndPos()
    obj.subtractProductAndSumDigit()
}
