def get_powerSet(string,ans):
    if len(string)==0:
        return ans
    left = get_powerSet(string[1:],ans+string[0])
    right= get_powerSet(string[1:],ans)
    return left+right
    
print(get_powerSet("abc"," "))