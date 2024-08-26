//https://leetcode.com/problems/rotate-image/
package rotate_image

fun Array<IntArray>.toFormattedString(): String {
    return this.joinToString(separator = "\n") { it.joinToString(prefix = "[", postfix = "]", separator = ", ") }
}

class Solution {
    fun rotate(matrix: Array<IntArray>) {
        val n = matrix.size - 1
        for (col in 0 until n) {
            quadrantRotate(matrix, col, n)
        }
    }

    fun quadrantRotate(matrix: Array<IntArray>, offset: Int, n: Int) {
        for (row in offset until n - offset) {
            val first = matrix[offset][offset + row]
            val second = matrix[offset + row][n - offset]
            val third = matrix[n - offset][n - offset - row]
            val forth = matrix[n - offset - row][offset]
            matrix[offset + row][n - offset] = first //$first -> $second;
            matrix[n - offset][n - offset - row] = second //$second -> $third;
            matrix[n - offset - row][offset] = third //$third -> $forth;
            matrix[offset][offset + row] = forth //$forth -> $first
//            println("row $row: $first -> $second; $second -> $third; $third -> $forth; $forth -> $first")
        }

    }
}

fun main() {
    val solution = Solution()

//    example1(solution)
    example2(solution)
}

fun example1(solution: Solution) {
//    Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
//    Output: [[7,4,1],[8,5,2],[9,6,3]]
    val input = arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9))
    val output = arrayOf(intArrayOf(7, 4, 1), intArrayOf(8, 5, 2), intArrayOf(9, 6, 3))
    solution.rotate(input)
    println("Example 1")
    println("Input after\n${input.toFormattedString()}")
    println("Expected result\n${output.toFormattedString()}")
    require(input.contentEquals(output))
}

fun example2(solution: Solution) {
//    Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
//    Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
    val input =
        arrayOf(intArrayOf(5, 1, 9, 11), intArrayOf(2, 4, 8, 10), intArrayOf(13, 3, 6, 7), intArrayOf(15, 14, 12, 16))
    val output =
        arrayOf(intArrayOf(15, 13, 2, 5), intArrayOf(14, 3, 4, 1), intArrayOf(12, 6, 8, 9), intArrayOf(16, 7, 10, 11))
    solution.rotate(input)
    println("Example 2")
    println("Input after\n${input.toFormattedString()}")
    println("Expected result\n${output.toFormattedString()}")
    require(input.contentDeepEquals(output))
}