//https://leetcode.com/problems/number-of-good-pairs/
package number_of_good_pairs

class Solution {
    fun numIdenticalPairs(nums: IntArray): Int {
        var counter = 0
        for (i in nums.indices)
            for (j in i until nums.size)
                if (nums[i] == nums[j] && i < j)
                    counter++

        return counter
    }
}

fun main() {
    val nums = arrayOf(1, 2, 3, 1, 1, 3)

    val solution = Solution()
    println(solution.numIdenticalPairs(nums.toIntArray()))
}
