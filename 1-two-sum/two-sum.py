# class Solution(object):
#     def twoSum(self, nums, target):
#         """
#         :type nums: List[int]
#         :type target: int
#         :rtype: List[int]
#         """
class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        # Map to store the value and its corresponding index
        num_map = {}
        
        for index, num in enumerate(nums):
            complement = target - num
            
            # If the complement is already in the map, we found the pair
            if complement in num_map:
                return [num_map[complement], index]
            
            # Otherwise, stock the current number and its index in the map
            num_map[num] = index