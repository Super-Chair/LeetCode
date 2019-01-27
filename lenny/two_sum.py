class Solution:
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        ans = None
        for i in range(0,len(nums)):
        	for j in range(i+1,len(nums)):
        		if(nums[i] + nums[j] == target):
        			ans = [i, j]
        			return ans
        return ans
        
    def twoSumV2(self, nums, target):
    	ans = None
    	for i in range(0, len(nums)-1):
    		targetNum = target - nums[i]
    		if targetNum in nums[i+1:len(nums)]:
    			ans = [i,nums[i+1:len(nums)].index(targetNum) + i + 1]
    			return ans
    	return ans

    def twoSumV3(self, nums, target):
        if len(nums) <= 1:
            return False
        buff_dict = {}
        for i in range(len(nums)):
            if nums[i] in buff_dict:
                return [buff_dict[nums[i]], i]
            else:
                buff_dict[target - nums[i]] = i

if __name__ == '__main__':
	nums = [2,3,7,9]
	target = 10
	print(Solution().twoSumV2(nums, target))