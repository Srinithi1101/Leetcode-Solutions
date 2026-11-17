class Solution:
    def maximumWealth(self, accounts: list[list[int]]) -> int:
        max_wealth=0
        for i in accounts:
            total=sum(i)
            if total > max_wealth:
                max_wealth=total
        return max_wealth
        