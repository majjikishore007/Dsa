def ispar(self, x):
    # code here
    if len(x) == 0:
        return True
    if '[]' in x:
        return self.ispar(x.replace('[]', ""))
    if '()' in x:
        return self.ispar(x.replace('()', ""))
    if '{}' in x:
        return self.ispar(x.replace('{}', ""))
    else:
        return False


string = "[({[]})]"
print(ispar(string))
