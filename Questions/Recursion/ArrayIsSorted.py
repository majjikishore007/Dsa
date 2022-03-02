def check_if_sorted(arr):
    if len(arr)-1 == 0:
        return True    
    return arr[0] <= arr[1] and check_if_sorted(arr[1:])

print(check_if_sorted([2,6,7,1,98]))