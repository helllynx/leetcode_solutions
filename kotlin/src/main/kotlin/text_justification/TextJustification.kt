////https://leetcode.com/problems/text-justification/
//package text_justification
//
//class Solution {
//    fun fullJustify(words: Array<String>, maxWidth: Int): List<String> {
//        val listOfLines = mutableListOf<List<String>>()
//        var summaryLineLength = 0
//        var temporaryList = mutableListOf<String>()
//        words.forEach {
//            if (summaryLineLength + it.length >= maxWidth) {
//                summaryLineLength = 0
//                listOfLines.add(it)
//            }
//            else {
//                summaryLineLength += it.length
//            }
//        }
//
//        return emptyList()
//    }
//}
//
//fun main() {
//    val words = arrayOf("This", "is", "an", "example", "of", "text", "justification.")
//
//    val solution = Solution()
//    solution.fullJustify(words, 16)
//}