def get(n):
    res = [[]]
    for line in range(1, n+1):
        c = 1
        temp = []
        for i in range(1, line+1):
            print(c, end=" ")
            temp.append(c)
            c = c*(line-i)//i
        print()
        res.append(temp)
    print(res[4])


get(5)
