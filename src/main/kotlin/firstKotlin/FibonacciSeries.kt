package firstKotlin

class FibonacciSeries {
    fun fibonacciSeries(num:Int){
        var num1=0
        var num2=1
        println(0)
        println("$num2")
        var sum =0
        for (i in 2 until num){
            sum = num1+num2
            println(sum)
            num1=num2
            num2=sum
        }

    }
}

fun main(){
    val obj = FibonacciSeries()
    obj.fibonacciSeries(5)
}