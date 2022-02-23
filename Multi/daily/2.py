def getFre(string,ele):
    d={}
    for i in  string:
        if i in d:
            d[i] +=1
        else:
            d[i]=1
    return d[ele]


string=input()
ele=input()
print(getFre(string,ele))