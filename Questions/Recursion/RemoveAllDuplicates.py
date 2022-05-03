def remove_duplictes(string, ans):
    if len(string)-1 == 0:
        ans+=string[0]
        return ans
    if string[0] != string[1]:
        ans+=string[0]
    return remove_duplictes(string[1:], ans)

print(remove_duplictes("aaaaaa"," "))