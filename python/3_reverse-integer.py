# https://leetcode.com/problems/reverse-integer/

class Solution:
    def reverse(self, x: int) -> int:
        ans = 0
        if (x > 0):
            ans = int(str(x)[::-1])
        elif (x < 0):
            ans = int('-' + str(x)[:0:-1])

        if (ans < -2147483648 or ans > 2147483647):
            return 0

        return ans
