package allAboutArray.easy

class ConcatenationArray {
    fun getConcatenation(nums: IntArray): IntArray {
        val temp = IntArray(nums.size *2)
        for (i in nums.indices){
            temp[i] = nums[i]
            temp[i+nums.size] = nums[i]
        }
        return temp
    }
}