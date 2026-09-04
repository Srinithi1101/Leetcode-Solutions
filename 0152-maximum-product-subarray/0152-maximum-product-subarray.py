class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        currentMax=nums[0]
        currentMin=nums[0]
        ans=nums[0]
        for i in range(1,len(nums)):
            if nums[i]<0:
                currentMax,currentMin=currentMin,currentMax
            oldMax=currentMax
            oldMin=currentMin
            currentMax=max(nums[i],oldMax*nums[i])
            currentMin=min(nums[i],oldMin*nums[i])
            ans=max(ans,currentMax)
        return ans   
        