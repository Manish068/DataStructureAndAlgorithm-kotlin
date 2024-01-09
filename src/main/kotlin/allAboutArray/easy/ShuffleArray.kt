package allAboutArray.easy

class ShuffleArray {
    fun shuffle(nums: IntArray, n: Int): IntArray {
        val ans = IntArray(2*n)

        for (i in 0 until  n){
            ans[i * 2] = nums[i]
            ans[i*2+1] = nums[i+n]
        }

        return ans
    }
}


/*
nums1 = [2,5,1]
nums2 = [3,4,7]

nums[0] = nums1[0] 2
nums[0+1] = nums2[0] 3


* */