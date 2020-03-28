#https://leetcode.com/problems/is-subsequence/

class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:

        if (len(s) == 0):
            return True

        s_i = 0
        t_i = 0
        s_len = len(s)
        t_len = len(t)

        while t_i < t_len and s_i < s_len:
            if s[s_i] == t[t_i]:
                s_i+=1
                t_i+=1
            else:
                t_i+=1
        return s_len == s_i