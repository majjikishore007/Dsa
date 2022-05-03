def getReversed(string):
    ans = ' '
    return reverse_helper(string, ans)


def reverse_helper(string, ans):
    if len(string) - 1 == 0:
        return ans
    ans = string[0]+ans
    return reverse_helper(string[1:], ans)


print(getReversed("majji"))
