//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
package remove_duplicates_from_sorted_array

class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var j = 0
        for (i in nums.indices) {
            if (nums[i] != nums[j]) {
                j += 1
                nums[j] = nums[i]
            }
        }
        return j + 1
    }
}


fun main() {
    val nums = arrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)

    val solution = Solution()
    println(solution.removeDuplicates(nums.toIntArray()))
    nums.forEach {
        print("$it ")
    }
}