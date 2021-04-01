//https://leetcode.com/problems/merge-two-sorted-lists/submissions/
package merge_two_sorted_lists

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class Solution {
    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
        if (l1?.`val` == null && l2?.`val` == null) return null
        if (l1?.`val` == null) return l2
        if (l2?.`val` == null) return l1

        if (l1.`val` < l2.`val`) {
            l1.next = mergeTwoLists(l1.next, l2)
            return l1
        }

        l2.next = mergeTwoLists(l2.next, l1)
        return l2
    }
}

fun main() {
    val l1_0 = ListNode(1)
    val l1_1 = ListNode(3)
    val l1_2 = ListNode(5)
    l1_0.next = l1_1
    l1_1.next = l1_2

    val l2_0 = ListNode(2)
    val l2_1 = ListNode(4)
    val l2_2 = ListNode(6)
    l2_0.next = l2_1
    l2_1.next = l2_2

    val solution = Solution()
    val result = solution.mergeTwoLists(l1_0, l2_0)
}
