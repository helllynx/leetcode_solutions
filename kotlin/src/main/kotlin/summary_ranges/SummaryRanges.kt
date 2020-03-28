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
    val words = arrayOf(0, 1, 2, 4, 5, 7)

    val solution = Solution()
    solution.summaryRanges(words.toIntArray())
}
