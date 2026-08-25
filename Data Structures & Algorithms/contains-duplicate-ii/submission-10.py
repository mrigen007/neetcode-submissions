class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
        hh={}
        flag =  False
        ind=0
        for i in range(0,len(nums)):
            if nums[i] in hh:
                kk=hh[nums[i]]
                if abs(kk-i)<=k:
                    flag=True
            hh[nums[i]]=i
        return flag
                    