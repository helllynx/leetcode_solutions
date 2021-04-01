//https://leetcode.com/problems/decompress-run-length-encoded-list/
package decompress_run_length_encoded_list

class Solution {
    fun decompressRLElist(nums: IntArray): IntArray {
        val result = mutableListOf<Int>()

        for (i in nums.indices step 2) {
            result.addAll(Array(nums[i]) { nums[i + 1] })
        }

        return result.toIntArray()
    }

    // this one a bit faster
    fun decompressRLElistV2(nums: IntArray): IntArray {
        val result = mutableListOf<Int>()

        for (i in nums.indices step 2) {
            repeat(nums[i]) {
                result.add(nums[i + 1])
            }
        }

        return result.toIntArray()
    }
}

fun main() {
    val nums = arrayOf(1, 2, 3, 4)

    val solution = Solution()
    println(solution.decompressRLElist(nums.toIntArray()).joinToString(" "))
}
