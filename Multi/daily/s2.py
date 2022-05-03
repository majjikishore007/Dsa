def get(n, k):
    arr = []

    while(n != 0):
        arr.append(n % 10)
        n = n//10

    arr.reverse()
    brr = []
    L = len(arr)
    for i in range(len(arr)):
        if arr[i] % 2 == 0:
            index = (i+k) % L
            brr.append(arr[index])
        else:
            brr.append(arr[i])
    ans = ''
    for i in brr:
        ans += str(i)

    return int(ans)


n = int(input())
k = int(input())
print(get(n, k))
