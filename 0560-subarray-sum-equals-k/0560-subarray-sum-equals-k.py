class Solution:
    # def subarraySum(self, nums: List[int], k: int) -> int:
    #     count=0
    #     sum=0
    #     for i in range(len(nums)):
    #         total=0
    #         for j in range(i,len(nums)):
    #             total+=nums [j]
    #             if total==k:
    #                 count+=1
    #     return count        
    
    def subarraySum(self, nums: List[int], k: int) -> int:
        count = 0
        total = 0
        d = {0: 1}

        for num in nums:
            total += num

            if total - k in d:
                count += d[total - k]

            d[total] = d.get(total, 0) + 1

        return count


        