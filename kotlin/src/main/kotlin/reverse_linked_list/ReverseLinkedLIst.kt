//https://leetcode.com/problems/running-sum-of-1d-array/
package reverse_linked_list

class ListNode(var value: Int) {
    var next: ListNode? = null

    override fun toString(): String {
        val result = StringBuilder()
        var current: ListNode? = this
        while (current != null) {
            result.append("${current.value}->")
            current = current.next
        }
        result.append("null")
        return result.toString()
    }
}

class Solution {
    fun reverseListIterative(head: ListNode?): ListNode? {
        var current = head
        var previous: ListNode? = null

        while (current != null) {
            val next = current.next
            current.next = previous
            previous = current
            current = next
        }

        return previous
    }

    fun reverseListRecursive(head: ListNode?): ListNode? {
        if (head == null || head.next == null) return head

        val previous = reverseListRecursive(head.next)

        head.next?.next = head
        head.next = null

        return previous
    }
}

fun main() {
    val l0 = ListNode(0)
    val l1 = ListNode(1)
    val l2 = ListNode(2)
    val l3 = ListNode(3)

    l0.next = l1
    l1.next = l2
    l2.next = l3

//    println(Solution().reverseListIterative(l0)?.toString())
    println(Solution().reverseListRecursive(l0)?.toString())
}
