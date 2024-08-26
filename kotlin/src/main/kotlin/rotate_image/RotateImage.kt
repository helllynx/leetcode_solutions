//https://leetcode.com/problems/rotate-image/
package rotate_image

fun Array<IntArray>.toFormattedString(): String {
    return this.joinToString(separator = "\n") { it.joinToString(prefix = "[", postfix = "]", separator = ", ") }
}

class Solution {
    fun rotate(matrix: Array<IntArray>) {
        val n = matrix.size - 1
        for (offset in 0 until n) {
            quadrantRotate(matrix, offset, n)
        }
    }

    // Runtime: 173 ms, faster than 57.50% Memory Usage: 35.1 MB, less than 83.75%
//    fun quadrantRotate(matrix: Array<IntArray>, offset: Int, n: Int) {
//        for (row in offset until n - offset) {
//            // Store the first element in a temp variable
//            val temp1 = matrix[offset][row]
//            // Move the element from the right to the top
//            matrix[offset][row] = matrix[n - row][offset]
//            // Move the element from the bottom to the right
//            val temp2 = matrix[row][n - offset]
//            matrix[row][n - offset] = temp1
//            // Move the element from the left to the bottom
//            matrix[n - row][offset] = matrix[n - offset][n - row]
//            // Finally, move the stored left element to the left
//            matrix[n - offset][n - row] = temp2
//        }
//    }

    // Strange but dumb way is better...
    // Runtime: 168 ms, faster than 68.75% Memory Usage: 35 MB, less than 92.25%
    fun quadrantRotate(matrix: Array<IntArray>, offset: Int, n: Int) {
        for (row in offset until n - offset) {
            val first = matrix[offset][row]
            val second = matrix[row][n - offset]
            val third = matrix[n - offset][n - row]
            val forth = matrix[n - row][offset]
            matrix[row][n - offset] = first //$first -> $second;
            matrix[n - offset][n - row] = second //$second -> $third;
            matrix[n - row][offset] = third //$third -> $forth;
            matrix[offset][row] = forth //$forth -> $first
        }
    }
}

fun main() {
    val solution = Solution()

    example1(solution)
    example2(solution)
    failed(solution)
//    sequential(solution)
}

fun example1(solution: Solution) {
//    Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
//    Output: [[7,4,1],[8,5,2],[9,6,3]]
    val input = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6),
        intArrayOf(7, 8, 9)
    )
    val output = arrayOf(
        intArrayOf(7, 4, 1),
        intArrayOf(8, 5, 2),
        intArrayOf(9, 6, 3)
    )
    solution.rotate(input)
    println("Example 1")
    println("Input after\n${input.toFormattedString()}")
    println("Expected result\n${output.toFormattedString()}")
    require(input.contentDeepEquals(output))
}

fun example2(solution: Solution) {
//    Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
//    Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
    val input =
        arrayOf(
            intArrayOf(5, 1, 9, 11),
            intArrayOf(2, 4, 8, 10),
            intArrayOf(13, 3, 6, 7),
            intArrayOf(15, 14, 12, 16)
        )
    val output =
        arrayOf(
            intArrayOf(15, 13, 2, 5),
            intArrayOf(14, 3, 4, 1),
            intArrayOf(12, 6, 8, 9),
            intArrayOf(16, 7, 10, 11)
        )
    solution.rotate(input)
    println("Example 2")
    println("Input after\n${input.toFormattedString()}")
    println("Expected result\n${output.toFormattedString()}")
    require(input.contentDeepEquals(output))
}

fun failed(solution: Solution) {
    val input =
        arrayOf(
            intArrayOf(2, 29, 20, 26, 16, 28),
            intArrayOf(12, 27, 9, 25, 13, 21),
            intArrayOf(32, 33, 32, 2, 28, 14),
            intArrayOf(13, 14, 32, 27, 22, 26),
            intArrayOf(33, 1, 20, 7, 21, 7),
            intArrayOf(4, 24, 1, 6, 32, 34)
        )

    val output = arrayOf(
        intArrayOf(4, 33, 13, 32, 12, 2),
        intArrayOf(24, 1, 14, 33, 27, 29),
        intArrayOf(1, 20, 32, 32, 9, 20),
        intArrayOf(6, 7, 27, 2, 25, 26),
        intArrayOf(32, 21, 22, 28, 13, 16),
        intArrayOf(34, 7, 26, 14, 21, 28)
    )

    println("Input before\n${input.toFormattedString()}")
    solution.rotate(input)
    println("Example failed")
    println("Input after\n${input.toFormattedString()}")
    println("Expected result\n${output.toFormattedString()}")
    require(input.contentDeepEquals(output))
}

fun sequential(solution: Solution) {
    val n = 6
    var counter = 1

    val matrix = Array(n) { IntArray(n) }

    for (i in 0 until n) {
        for (j in 0 until n) {
            matrix[i][j] = counter++
        }
    }

    println("Input before\n${matrix.toFormattedString()}")
    solution.rotate(matrix)
    println("Example failed")
    println("Input after\n${matrix.toFormattedString()}")

}