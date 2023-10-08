class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        arr = []
        nums.sort()
        for i, data in enumerate(nums):
            if i > 0 and nums[i - 1] == data:
                continue
            l = i + 1
            r = len(nums) - 1
            while l < r:
                s = data + nums[l] + nums[r]
                if s > 0:
                    r -= 1
                elif s < 0:
                    l += 1
                else:
                    arr.append([data, nums[l], nums[r]])
                    l += 1
                    while l < r and nums[l-1] == nums[l]:
                        l += 1
        return arr
    
# Question.......................................................................................................................


# Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

# Notice that the solution set must not contain duplicate triplets.

 

# Example 1:

# Input: nums = [-1,0,1,2,-1,-4]
# Output: [[-1,-1,2],[-1,0,1]]
# Explanation: 
# nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
# nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
# nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
# The distinct triplets are [-1,0,1] and [-1,-1,2].
# Notice that the order of the output and the order of the triplets does not matter.
# Example 2:

# Input: nums = [0,1,1]
# Output: []
# Explanation: The only possible triplet does not sum up to 0.
# Example 3:

# Input: nums = [0,0,0]
# Output: [[0,0,0]]
# Explanation: The only possible triplet sums up to 0.
 

# Constraints:

# 3 <= nums.length <= 3000
# -105 <= nums[i] <= 105



# Solution.......................................................................................................................

# We define a class Solution with a method threeSum that takes a list of integers nums as input and returns a list of lists containing unique triplets that sum to zero.

# We initialize an empty list arr to store the triplets that satisfy the given conditions.

# We sort the input array nums in ascending order. Sorting is crucial for this algorithm to work efficiently.

# We iterate through the elements of nums using a for loop and an enumerator (enumerate). For each element data at index i, we check if it's a duplicate. If it's a duplicate and not the first occurrence, we skip it to avoid duplicate triplets.

# We initialize two pointers, l and r, representing the left and right ends of the remaining elements in the sorted array.

# We use a while loop to implement a two-pointer approach to find pairs of elements that sum to the negative of the current element data. The pointers l and r move towards each other as we adjust them based on the sum s.

# If s is greater than zero, we decrement the right pointer r to reduce the sum. If s is less than zero, we increment the left pointer l to increase the sum.

# When we find a triplet where s equals zero, we add [data, nums[l], nums[r]] to the arr list, as it satisfies the condition of three elements summing to zero.

# After adding a triplet, we increment the left pointer l to skip over any duplicates. We continue doing this until l is no longer pointing to a duplicate element.

# Finally, we return the list arr, which contains all the unique triplets that meet the specified conditions.