#https://leetcode.com/problems/range-sum-of-bst/

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    
    def __init__(self):
        self.S = 0
    
    def rangeSumBST(self, root: 'TreeNode', L: 'int', R: 'int') -> 'int':
        self.recbts(root, L, R)
        return self.S    
        
    def recbts(self, node: 'TreeNode', L, R):
        if node is not None:
            if node.val >= L and node.val <= R:
                self.S += node.val
            self.recbts(node.right, L, R)
            self.recbts(node.left, L, R)
