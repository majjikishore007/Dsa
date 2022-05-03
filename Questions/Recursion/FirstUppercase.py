def getFirstUppercase(word):
    if len(word) == 0:
        return ' '

    if(word[0].isupper()):
        return word[0]
    else:
        return getFirstUppercase(word[1:])


print(getFirstUppercase("helksdPjh"))
