class Solution:
    def maxArea(self, h: List[int]) -> int:
        l = len(h)-1
        i , j = 0 , l
        prod = 0
        for k in range(0,l):
            prod1 = min(h[i],h[j])*(abs(j-i))
            if prod1 > prod:
                prod = prod1
            if h[i] > h[j]:
                j -= 1
            else:
                i +=1
        
        return prod


        