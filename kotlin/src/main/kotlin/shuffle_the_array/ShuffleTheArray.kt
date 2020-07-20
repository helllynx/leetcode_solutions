//https://leetcode.com/problems/shuffle-the-array/
package shuffle_the_array

class Solution {
    fun shuffle(nums: IntArray, n: Int): IntArray {
        return IntArray(n * 2).apply {
            var j = 0
            for (i in 0 until n * 2 step 2) {
                this[i] = nums[j]
                this[i + 1] = nums[j + n]
                j += 1
            }
        }
    }
}

fun main() {
    val nums = arrayOf(1,2,3,4,4,3,2,1)

    val solution = Solution()
    println(solution.shuffle(nums.toIntArray(), nums.size / 2).joinToString(" "))
}
