//https://leetcode.com/problems/maximum-depth-of-binary-tree/
package maximum_depth_of_binary_tree

class TreeNode(var value: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}
class Solution {
    fun maxDepth(root: TreeNode?): Int {

        return 0
    }
}

fun main() {
    val root = TreeNode(3)
    root.left = TreeNode(9)
    root.right = TreeNode(20)
    root.right!!.left = TreeNode(15)
    root.right!!.right = TreeNode(7)



    val solution = Solution()
    println(solution.maxDepth(root))
}
