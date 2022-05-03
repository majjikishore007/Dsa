'''
Time O(N)
space O(1)



'''

def chech_dupli(arr):
    slow = arr[0]
    fast = arr[arr[0]]

    while(slow != fast):
        slow = arr[slow]
        fast = arr[arr[fast]]

    fast = 0
    while(fast != slow):
        fast = arr[arr[fast]]
        slow = arr[slow]
    return slow


print(chech_dupli([1,2,3,5,4,5]))