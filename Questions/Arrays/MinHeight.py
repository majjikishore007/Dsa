def get_min_diffs(arr, k):
    # sort the array of heights
    arr.sort()

    sT = arr[0]
    bT = arr[-1]
    ans = bT-sT

    for i in range(1, len(arr)):
        if arr[i] >= k:
            sT = min(ar[i]-k, sT+k)
            bT = max(ar[i]+k, bT-k)
        ans = min(bT-sT, ans)

    return ans
