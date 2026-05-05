class Solution:
    def subtractProductAndSum(self, n: int) -> int:
        temp = n
        add_ = 0
        product = 1
        while temp > 0:
            r = temp % 10
            temp //= 10
            add_ += r
            product *= r
        return product-add_
        