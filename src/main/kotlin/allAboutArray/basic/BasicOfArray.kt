package allAboutArray.basic

import allAboutArray.ArrayOperation
import java.util.Arrays

class BasicOfArray : ArrayOperation {
    private lateinit var arr:IntArray

    constructor(size:Int){
        arr = IntArray(size)
    }

    constructor(arr:IntArray){
        this.arr = arr
    }

    fun giveMeValueAtIndex(index: Int): Int = arr[index]


    override fun printArray() {
        println(arr.contentToString())
    }

    override fun giveMeFirstIndexValue(): Int = arr.first()

    override fun giveMeLastIndexValue(): Int = arr[arr.size - 1]
    override fun giveMeValueFromIndex(index: Int): Int = arr.lastIndex


    override fun setElementAtIndex(index: Int, value: Int) {
        arr[index] = value
    }

    override fun searchingInArray(key: Int): Int {
        for (i in arr.indices){
            if(key==arr[i])
                return i
        }
        return -1
    }

    override fun insertSorted(value: Int) {
        val  capacity = arr.size-1
        val filledIndexs = arr.filter { it>0 }.toList().size
        if(filledIndexs>capacity){
            return
        }
        arr[filledIndexs]=value
    }

    override fun removeElementFromIndex(index: Int): Int {
        val removedElement = arr[index]
        arr[index]=0
        return removedElement
    }

    override fun removeFirstElement(): Int {
        val removedElement = arr[0]
        arr[0]=0
        return removedElement
    }

    override fun removeLastElement(): Int {
        val removedElement = arr[0]
        arr[arr.size-1]=0
        return removedElement
    }


}