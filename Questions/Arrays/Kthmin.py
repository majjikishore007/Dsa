'''
1.using Sorting and then return the element at the index 

Mereg sort

Time O(nlogn)
Space O(logn)

TODO: using priority Queue


'''


class Solution:
    def kthSmallest(self, arr, l, r, k):
        '''
        arr : given array
        l : starting index of the array i.e 0
        r : ending index of the array i.e size-1
        k : find kth smallest element and return using this function
        '''
        arr.sort()
        return arr[k]
