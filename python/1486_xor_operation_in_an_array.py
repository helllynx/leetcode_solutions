# https://leetcode.com/problems/xor-operation-in-an-array/


class Solution:
    def xorOperation(self, n: int, start: int) -> int:
        count = 1
        result = start
        while count < n:
            result ^= start + 2 * count
            count += 1
        return result


start = 3
count = 4
answer = 8

result = Solution().xorOperation(count, start)
print(result)
print(result == answer)
