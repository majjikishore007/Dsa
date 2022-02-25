# 1.find if the array is sorted or not

def is_sorted(array):
    index = 1
    print(len(array))
    L = len(array)

    return helper(array, index, L)


def helper(array, index, L):
    if index == L:
        return True
    return int(array[index-1]) <= int(array[index]) and helper(array, index+1, L)

# 2.Linear Search with recuersion


def find(array, key):
    index = 0
    return helper_find(array, key, index)


def helper_find(array, key, index):
    if index == len(array):
        return -1
    if (array[index]) == key:
        return index

    return helper_find(array, key, index+1)


array = [1, 89, 23]
print(find(array, 3))
