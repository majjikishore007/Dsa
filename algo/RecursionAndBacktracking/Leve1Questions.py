#1.print all the numbers from n to 1 using recuersion
import math


def print_n_to_1(n):
    if n < 1:
        return
    print(n)
    print_n_to_1(n-1)


#2.print from 1 to numbers


def print_1_to_n(n):
    if n < 1:
        return
    print_1_to_n(n-1)
    print(n)


#3.Factroial of a number
def factroial(n):
    if n < 1:
        return 1
    return n*factroial(n-1)


#4.Sum  of a numbers from 1 to n


def sum_of_numbers(n):
    if n < 1:
        return 0
    return n+sum_of_numbers(n-1)


#5.print all the digits of a number


def digits_of_numbers(n):
    if n == 0:
        return
    print(n % 10)

    return digits_of_numbers(n//10)


#6.print sum  the digits of a number

def sum_of_digits(n):
    if n == 0:
        return 0

    return (n % 10) + sum_of_digits(n//10)


#7.print product the digits of a number
def product_of_digits(n):
    if n == 0:
        return 1

    return (n % 10) * product_of_digits(n//10)

#8.reverse  a  number


def reverse(n):
    rev = ''
    return reverse_helper(n, rev)


def reverse_helper(n, rev):
    if n == 0:
        return rev
    rev += str(n % 10)
    return reverse_helper(n//10, rev)
#9.another approach for the  above problem


def reverse_method2(n: int):
    digits = math.log10()
    return reverse_helper_method2(n)


print(reverse(12345))
