

def getAns(n):
    arr = []
    while(n != 0):
        arr.append(n % 10)
        n = n//10

    res = ""

    while(len(arr) != 0):
        first = arr.pop()
        if len(arr) == 0:
            res = res+str(first)
        else:
            second = arr.pop()
            res = res + str(max(first, second))
    return res


n = int(input())
print(getAns(n))
