package firstKotlin

class ArmstrongNumber {
    fun armstrongNumber(num: Int): Boolean {
        var originalNum = 1634
        var num = 1634
        var j = num.toString().length
        println(j)
        var sum = 0
        while (num != 0) {
            val remainder = num % 10
            println(remainder)
            sum += remainder.pow(j)
            println(sum)
            num /= 10
        }
        return originalNum == sum
    }
}

fun Int.pow(pow: Int): Int {
    var s = this
    var orginal = pow
    while (orginal > 1) {
        s *= this
        println("Sum $s")
        orginal--
    }
    return s
}

fun main() {
    val obj = ArmstrongNumber()
    println(obj.armstrongNumber(1))
}