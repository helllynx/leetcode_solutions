//https://leetcode.com/problems/jewels-and-stones/
package add_two_numbers

import java.math.BigInteger

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class ListNode(var `val`: Int) {
    var next: ListNode? = null

    override fun toString(): String {
        val result = StringBuilder()
        var current: ListNode? = this
        while (current != null) {
            result.append("${current.`val`}->")
            current = current.next
        }
        result.append("null")
        return result.toString()
    }
}

class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        if (l1 == null || l2 == null) {
            return null
        }
        val l1arr = linkedToArrayList(l1)
        l1arr.reverse()
        val l2arr = linkedToArrayList(l2)
        l2arr.reverse()

        println(l1arr)
        println(l2arr)

        val l1num = listToBigInteger(l1arr)
        val l2num = listToBigInteger(l2arr)

        val result = l1num + l2num

        return reverseDigits(result.toString()).toLinkedList()
    }

    fun reverseDigits(number: String): List<Int> {
        return number.reversed().map { it.toString().toInt() }
    }


    fun linkedToArrayList(l1: ListNode): MutableList<Int> {
        val result = mutableListOf<Int>()
        var current: ListNode = l1
        while (true) {
            result.add(current.`val`)

            if (current.next != null) {
                current = current.next!!
            } else {
                return result
            }
        }
    }

    fun listToBigInteger(list: List<Int>): BigInteger {
        var result = BigInteger.ZERO  // Use 'var' instead of 'val'
        list.size

        list.forEachIndexed { index, i ->
            val s = i.toBigInteger().multiply(BigInteger.TEN.pow(list.size - index - 1))
            result = result.add(s)
        }

        return result
    }

    fun List<Int>.toLinkedList(): ListNode? {
        if (this.isEmpty()) return null

        val head = ListNode(this[0])
        var curr = head

        this.slice(1 until this.size).forEach {
            curr.next = ListNode(it)
            curr = curr.next!!
        }

        return head
    }

}

fun main() {
    val solution = Solution()

    example1(solution)
}

fun example1(solution: Solution) {
//    l1 = [2,4,3], l2 = [5,6,4]
    val expected = listOf(7, 0, 8)

    val l1_0 = ListNode(2)
    val l1_1 = ListNode(4)
    val l1_2 = ListNode(3)

    l1_0.next = l1_1
    l1_1.next = l1_2

    val l2_0 = ListNode(5)
    val l2_1 = ListNode(6)
    val l2_2 = ListNode(4)

    l2_0.next = l2_1
    l2_1.next = l2_2

    val result = solution.addTwoNumbers(l1_0, l2_0)
    val result2 = solution.linkedToArrayList(l1_0)
    println(result)
    println(result2)
}
