def getSumTriangles(arr):
    return getSumTriangles_helper(arr, len(arr), 0)


def getSumTriangles_helper(arr, N, index):
    if N == 0:
        return
    if index < N-1:
        new = []
        sum = arr[0]+arr[1]
        new.append(sum)
        print(new)
        getSumTriangles_helper(arr[1:], N, index+1)
        arr = new
    else:
        getSumTriangles_helper(arr, N-1, index)


arr = [1, 2, 3, 4]

getSumTriangles(arr)
