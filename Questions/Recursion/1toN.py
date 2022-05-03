def one_to_n(n):
    if n == 0:
        return
    one_to_n(n-1)
    print(n, end=" ")


def get_fib(n):
    if n < 0:
        throw("Number not valid")
    if n < 1:
        return n
    return get_fib(n-1) + get_fib(n-1)


def get_length(string):
    if string is NULL:
        return 0
    return 1+get_length(string[1:])
