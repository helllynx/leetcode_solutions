// https://leetcode.com/problems/two-sum/
package two_sum

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        // Java style code
        for (i in 0 until nums.size - 1) {
            for (j in i + 1 until nums.size) {
                if ((nums[i] + nums[j]) == target) {
                    return intArrayOf(i, j)
                }
            }
        }
        return intArrayOf()
    }
}

fun main() {
    val nums = intArrayOf(-3, 4, 3, 90)
    val target = 0

    val result = Solution().twoSum(nums, target)
    result.forEach { println(it) }
}
