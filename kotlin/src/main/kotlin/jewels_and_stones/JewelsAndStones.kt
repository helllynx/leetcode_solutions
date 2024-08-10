//https://leetcode.com/problems/jewels-and-stones/
package jewels_and_stones

class Solution {
    fun numJewelsInStones(jewels: String, stones: String): Int {
        var count = 0
        val stoneList = stones.toMutableList()

        jewels.forEach { jewel ->
            val iterator = stoneList.iterator()
            println(stoneList)
            while (iterator.hasNext()) {
                val stone = iterator.next()
                if (jewel == stone) {
                    count += 1
                    iterator.remove()
                }
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

    require(solution.numJewelsInStones(jewels, stones) == 3)
}

fun example2(solution: Solution) {
    val jewels = "z"
    val stones = "ZZ"

    require(solution.numJewelsInStones(jewels, stones) == 0)
}