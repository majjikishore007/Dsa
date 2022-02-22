#1.find if the array is sorted or not

def is_sorted(array):
    print(array)
    index = 1
    return helper(array, index, len(array))


def helper(array, index, len):
    if index == len:
        return True
    return (array[index-1] <= array[index]) and helper(array, index+1, len(array))


arr = [1, 2, 3, 4, 5, 6, 7, 8, 9]

print(is_sorted([1, 2, 3]))
