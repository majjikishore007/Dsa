'''
* * * * *
* * * *
* *
*
'''


def print_pattern1(rows, cols):
    if rows == 0:
        return
    if cols < rows:
        print("*", end="")
        print_pattern1(rows, cols+1)

    else:
        print("")
        print_pattern1(rows-1, 0)


'''
*
* *
* * *
* *  *  *
'''


def print_pattern2(rows, cols):
    if rows == 0:
        return
    if cols < rows:
        print_pattern2(rows, cols+1)
        print("*", end="")
    else:
        print_pattern2(rows-1, 0)
        print("")


print_pattern2(4, 0)
