//https://leetcode.com/problems/reverse-integer/
package search_insert_position

class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        if (nums.last() < target) return nums.size
        if (nums.first() > target) return 0
        var currentIndex = nums.size / 2
        while (true) {
            if(nums[currentIndex] == target)
                return currentIndex
            if(nums[currentIndex] > target)
                currentIndex += currentIndex / 2
            else
                currentIndex -= currentIndex / 2

        }
    }
}

fun main() {
    val nums = intArrayOf(1,3,5,6)
    val target = 5

    val solution = Solution()
    println(solution.searchInsert(nums, target))
}
