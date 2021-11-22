def is_palindrome(s):
    rev=s[::-1]
    if (s == rev):
        return True
    else :
        return False



s=input("Enter the string ")

print(is_palindrome(s))
