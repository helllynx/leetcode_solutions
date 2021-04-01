package valid_parentheses

class Solution {
    fun isValid(s: String): Boolean {
        val stack = ArrayDeque<Char>()
        s.forEach {
            when (it) {
                '(' -> stack.add('(')
                '[' -> stack.add('[')
                '{' -> stack.add('{')
            }
            if (stack.isEmpty()) return false
            when (it) {
                ')' -> if (stack.last() == '(') stack.removeLast() else return false
                ']' -> if (stack.last() == '[') stack.removeLast() else return false
                '}' -> if (stack.last() == '{') stack.removeLast() else return false
            }
        }
        return stack.isEmpty()
    }

    fun isValidV2(s: String): Boolean {
        val stack = ArrayDeque<Char>()
        s.forEach {
            when (it) {
                '(' -> stack.add('(')
                '[' -> stack.add('[')
                '{' -> stack.add('{')
                ')' -> if (stack.isNotEmpty() && stack.last() == '(') stack.removeLast() else return false
                ']' -> if (stack.isNotEmpty() && stack.last() == '[') stack.removeLast() else return false
                '}' -> if (stack.isNotEmpty() && stack.last() == '{') stack.removeLast() else return false
            }
        }
        return stack.isEmpty()
    }
}

fun main() {
    val sPositive = "()[]{}"
    val sNegative = "([)]"
    val sNegativeOne = "]"

    val solution = Solution()

    assert(solution.isValid(sPositive))
    assert(!solution.isValid(sNegative))
    assert(!solution.isValid(sNegativeOne))

    assert(solution.isValidV2(sPositive))
    assert(!solution.isValidV2(sNegative))
    assert(!solution.isValidV2(sNegativeOne))
}