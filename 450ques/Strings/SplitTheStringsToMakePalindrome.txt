'''
You are given two strings a and b of the same length. Choose an index and split both strings at the same index, splitting a into two strings: aprefix and asuffix where a = aprefix + asuffix, and splitting b into two strings: bprefix and bsuffix where b = bprefix + bsuffix. Check if aprefix + bsuffix or bprefix + asuffix forms a palindrome.
'''

# Brute force approch


def check_pali(a, b):
    print("Strings ", a, b)

    for i in range(len(a)):
        print("I", i)

        if(check_pali_helper(a[:i]+b[i:])) or (check_pali_helper(b[:i]+a[i:])):
            return True

    return False


'''
Efficent approcah 
Time O(n)
space O(n)



'''


def check_pali_helper(s, i, j):

    while(i < j):
        if(s[i] != s[j]):
            return False
        i += 1
        j -= 1

    return True


def palindrome_check(a, b):

    i, j = 0, len(a)-1

    while(i < j and a[i] == b[j]):
        i += 1
        j -= 1

    return check_pali_helper(a, i, j) or check_pali_helper(b, i, j)


def checkPalindromeFormation(a, b):

    return palindrome_check(a, b) or palindrome_check(b, a)


if __name__ == '__main__':

    a = input("Enter the a")
    b = input("Enter the b")
    print(checkPalindromeFormation(a, b))
