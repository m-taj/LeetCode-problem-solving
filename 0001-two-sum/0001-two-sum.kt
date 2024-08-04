class Solution {
     fun twoSum(nums: IntArray, target: Int): IntArray {
        val complimentaryNumbersHashMap = hashMapOf<Int,Int>()
        var resultArray = IntArray(2)
        for (index in nums.indices){
            val complimentIndex = complimentaryNumbersHashMap[nums[index]]
            if (complimentIndex != null ){
                resultArray=intArrayOf(complimentIndex,index)
                break
            }
            val complimentary = target - nums[index]
            complimentaryNumbersHashMap[complimentary] = index
        }
        return resultArray
    }
}