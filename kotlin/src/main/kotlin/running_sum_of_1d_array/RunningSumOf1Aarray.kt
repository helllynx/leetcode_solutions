//https://leetcode.com/problems/running-sum-of-1d-array/
package running_sum_of_1d_array

class Solution {
    fun runningSum(nums: IntArray): IntArray {
        if (nums.size == 1)
            return nums

        val result = IntArray(nums.size)

        result[0] = nums[0]

        for (i in 1 until nums.size) {
            result[i] = nums[i] + result[i - 1]
        }

        return result
    }
}

fun main() {
    val words = arrayOf(1)

    val solution = Solution()
    solution.runningSum(words.toIntArray())
}