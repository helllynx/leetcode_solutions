//https://leetcode.com/problems/jewels-and-stones/
package jewels_and_stones

class Solution {
    fun numJewelsInStones(jewels: String, stones: String): Int {
        val jewelsElements = jewels.toList()
        var count = 0

        stones.forEach { stone ->
            if (jewelsElements.contains(stone)) {
                count += 1
            }
        }

        return count
    }
}

fun main() {
    val solution = Solution()

    example1(solution)
    example2(solution)
}

fun example1(solution: Solution) {
    val jewels = "aA"
    val stones = "aAAbbbb"

    assert(solution.numJewelsInStones(jewels, stones) == 0)
}

fun example2(solution: Solution) {
    val jewels = "z"
    val stones = "ZZ"

    assert(solution.numJewelsInStones(jewels, stones) == 0)
}