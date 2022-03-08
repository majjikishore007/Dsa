def getAns(number):
    d = {
        "1": [' ', '@'],
        "2": ['A', 'B', 'C', 'a', 'b', 'c', '2'],
        "3": ['D', 'E', 'F', 'd', 'e', 'f', '3'],
        '4': ['G', 'H', 'I', 'g', 'h', 'i', '4'],
        "5": ['J', 'K', 'L', 'j', 'k', 'l', '5'],
        "6": ['M', 'N', 'O', 'm', 'n', 'o', '6'],
        '7': ['P', 'Q', 'R', 'S', 'p', 'q', 'r', 's', '7'],
        "8": ['T', 'U', 'V', 't', 'u', 'v', '8'],
        "9": ['W', 'X', 'Y', 'Z', 'w', 'x', 'y', 'z', '9'],
        '0': [' ', '0']
    }

    ans = ''
    i = 1
    count = 1
    while i < len(number):
        if number[i-1] == number[i]:
            count += 1
            i += 1
        elif number[i] == '_':
            count = count % len(d[number[i-1]])
            ans += d.get(number[i-1])[count-1]
            i += 2
            count = 1
        else:
            count = count % len(d[number[i-1]])
            print("count ", count)
            ans += d.get(number[i-1])[count-1]
            i += 1
            count = 1

    count = count % len(d[number[i-1]])
    ans += d.get(number[i-1])[count-1]
    return ans


print(getAns("22_2222444444"))
