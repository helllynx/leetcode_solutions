//https://leetcode.com/problems/summary-ranges/
package summary_ranges

class Solution {
    fun summaryRanges(nums: IntArray): List<String> {
        var start = nums[0]
        var end = nums[0]

        for (i in 1 until nums.size) {

        }

        return listOf()
    }
}

fun main() {
    val nums = arrayOf(0, 1, 2, 4, 5, 7)
    Solution().summaryRanges(nums.toIntArray())
}
