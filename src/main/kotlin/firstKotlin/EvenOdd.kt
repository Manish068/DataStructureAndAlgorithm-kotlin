package firstKotlin

//Write a program to print whether a number is even or odd, also take input from the user.
class EvenOdd {
    fun sayEvenOdd(num:Int):Boolean=num.mod(2)==0

}

fun main(){
    val obj = EvenOdd()
    val num =4;

    if(num>0){
        if(obj.sayEvenOdd(num)){
            println("$num is Even")
        }else{
            println("$num is Odd")
        }
    }else{
        println("Input number should be greater than 0")
    }
}