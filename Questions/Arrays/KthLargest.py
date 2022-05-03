'''
Kth Largest Element

1.Approach

Sort the array and return the kth element

Time O(NlogN)
Space O(1)

2.Approach two 


'''


class Solution:
	def getKthLargestElement(self, arr: List[int], k: int) -> int:
		# add your logic here
        arr.sort()
        return arr[k-1]
