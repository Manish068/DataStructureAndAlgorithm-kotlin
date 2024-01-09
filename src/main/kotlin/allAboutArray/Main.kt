package allAboutArray

import allAboutArray.basic.BasicOfArray
import allAboutArray.easy.*
import kotlin.math.abs

fun main() {
    val obj = BasicOfArray(10)
    obj.setElementAtIndex(0, 12)
    obj.setElementAtIndex(1, 16)
    obj.setElementAtIndex(2, 20)
    obj.setElementAtIndex(3, 40)
    obj.setElementAtIndex(4, 50)



    obj.printArray()

    obj.insertSorted(100)
    obj.insertSorted(123)

    obj.printArray()



    val obj2 = BasicOfArray(intArrayOf(5, 1, 3, 4, 2, 6))
    println(obj2.searchingInArray(4))


    val buildArray = BuildArray()
    println( buildArray.buildArray2(intArrayOf(5,0,1,2,3,4)).contentToString())

    val concatenationArray = ConcatenationArray()
    println(concatenationArray.getConcatenation(intArrayOf(1,2,1)).contentToString())

    val runningSumOf1DArray = RunningSumOf1DArray()
    println(runningSumOf1DArray.runningSum(intArrayOf(1,2,3,4)).contentToString())

    val richestCustomerWealth = RichestCustomerWealth()
    println(richestCustomerWealth.maximumWealth(arrayOf(intArrayOf(1,2,3), intArrayOf(3,2,1))))

    val shuffleArray = ShuffleArray()
    println(shuffleArray.shuffle(intArrayOf(2,5,1,3,4,7),3).contentToString())

}