//https://leetcode.com/problems/number-of-good-pairs/
package number_of_steps_to_reduce_a_number_to_zero

class Solution {

    private fun numberOfStepsRecursiveSolver(num: Int, step: Int): Int {
        if (num == 0) return step

        return if (num % 2 == 0)
            numberOfStepsRecursiveSolver(num / 2, step + 1)
        else
            numberOfStepsRecursiveSolver(num - 1, step + 1)
    }

    fun numberOfStepsRecursive(num: Int): Int {
        return numberOfStepsRecursiveSolver(num, 0)
    }

    fun numberOfStepsIterative(num: Int): Int {
        var number = num
        var counter = 0

        while (number != 0) {
            if (number % 2 == 0)
                number /= 2
            else
                number -= 1
            counter++
        }

        return counter
    }
}

fun main() {
    val num = 123

    val solution = Solution()
    println(solution.numberOfStepsRecursive(num))
    println(solution.numberOfStepsIterative(num))
}
