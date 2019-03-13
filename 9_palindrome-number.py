# https://leetcode.com/problems/palindrome-number/submissions/

class Solution:
    def isPalindrome(self, x):
        if x < 0:
            return False
        s = str(x)
        if len(s) == 2:
            return s[0]==s[1]
            if s[i] != s[-i]:
                return False
        return True