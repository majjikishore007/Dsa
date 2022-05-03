def getMax(arr):
    return getMax_helper(arr, -1)


def getMax_helper(arr, maxE):
    if len(arr) == 0:
        return maxE
    maxE = max(arr[0], maxE)
    return getMax_helper(arr[1:], maxE)


print(getMax([1, 4, 3, -5, -4, 8, 6]))
