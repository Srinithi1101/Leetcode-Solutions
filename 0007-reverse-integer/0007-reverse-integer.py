class Solution:
    def reverse(self, x: int) -> int:
        # rev = 0
        # n = -1 if x < 0 else 1
        # x = abs(x)

        # while x > 0:
        #     digit = x % 10
        #     rev = rev * 10 + digit
        #     x = x // 10

        # return rev * n
       
        rev = 0
        sign = -1 if x < 0 else 1
        x = abs(x)

        while x > 0:
            digit = x % 10
            rev = rev * 10 + digit
            x = x // 10

        rev = rev * sign

        return rev * (-2147483648 <= rev <= 2147483647)