//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
package how_many_numbers_are_smaller_than_the_current_number

class Solution {
    fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
        return IntArray(nums.size).apply {
            for (i in nums.indices) {
                for (j in 0 until i) {
                    if (nums[j] < nums[i])
                        this[i]++
                }
                for (j in i + 1 until nums.size) {
                    if (nums[j] < nums[i])
                        this[i]++
                }
            }
        }
    }
}

fun main() {
    val nums = arrayOf(8, 1, 2, 2, 3)

    val solution = Solution()
    println(solution.smallerNumbersThanCurrent(nums.toIntArray()).joinToString(" "))
}
