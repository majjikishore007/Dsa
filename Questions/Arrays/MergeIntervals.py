def merge(arr):
    arr.sort(c=lambda x, y: cmp(x[0], y[0]))
    ans = []
    curr = arr[0]
    for element in arr:
        if curr[1] > element[0]:
            curr[1] = max(curr[1], element[1])
        else:
            curr = element
            ans.append(curr)
    return ans
