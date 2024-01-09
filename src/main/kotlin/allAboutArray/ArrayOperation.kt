package allAboutArray

interface ArrayOperation {


    fun printArray()
    fun giveMeFirstIndexValue():Int
    fun giveMeLastIndexValue():Int

    fun giveMeValueFromIndex(index:Int):Int

    fun removeElementFromIndex(index: Int):Int

    fun removeFirstElement():Int

    fun removeLastElement():Int

    fun setElementAtIndex(index: Int, value: Int)

    fun searchingInArray(key:Int):Int

    //insertValue
    fun insertSorted(value: Int)
}