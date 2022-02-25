#1.remove all the occurances of a character int the given string

def remove_character(string, element):

    index = 0
    return helper_remove_character(string, element, index)


def helper_remove_character(string, element, index):
    if index == len(string):
        return ""
    if string[index] != element:
        return string[index]+helper_remove_character(string, element, index+1)
    return helper_remove_character(string, element, index+1)


def get_sebsequence(string):
    return helper_get_sebsequence_list('', string)


def helper_get_sebsequence(ans, string):
    if string == '':
        print(ans)
        return
    c = string[0]
    helper_get_sebsequence(ans+c, string[1:])
    helper_get_sebsequence(ans, string[1:])


'''
    getting the ans as a list
    1.creating list in body of the function
    2.passing list as argument
'''


def helper_get_sebsequence_list(ans, string):
    if string == '':
       res = []
       res.append(ans)
       return res

    c = string[0]
    left = helper_get_sebsequence_list(ans+c, string[1:])
    right = helper_get_sebsequence_list(ans, string[1:])

    left.extend(right)
    return left


string = "abc"
print(get_sebsequence(string))
