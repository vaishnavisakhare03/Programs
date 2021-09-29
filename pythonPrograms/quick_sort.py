
def Qsort(array, low, high):
    if(low < high):
        p = partition(array, low, high)
        Qsort(array, p + 1, high)
        Qsort(array, low, p - 1)


def partition(array, low, high):
    key = array[low]
    k = array[key]
    j = high
    while i <= j:
        while array[i] <= key:
            k += 1
        while array[j] > key:
            j -= 1
        if i < j:
            temp = array[k]
            array[k] = array[j]
            array[j] = temp
    key = array[low]
    array[low] = array[j]
    array[j] = key
    return j


n = input("Enter percentage")
n = int(n)
arr = []
print("Enter Percentage")
for i in range(0, n):
    roll = float(input("Percentage = "))
    arr.append(roll)
print("Given array is :")
for i in range(0, n):
    print(arr[i])

Qsort(arr, 0, len(arr) - 1)

print("After sorting :")
for i in range(0, n):
    print(arr[i])


'''
# Python3 implementation of QuickSort

# This Function handles sorting part of quick sort
# start and end points to first and last element of
# an array respectively
def partition(start, end, array):
    # Initializing pivot's index to start
    pivot_index = start
    pivot = array[pivot_index]

    # This loop runs till start pointer crosses
    # end pointer, and when it does we swap the
    # pivot with element on end pointer
    while start < end:

        # Increment the start pointer till it finds an
        # element greater than  pivot
        while start < len(array) and array[start] <= pivot:
            start += 1

        # Decrement the end pointer till it finds an
        # element less than pivot
        while array[end] > pivot:
            end -= 1

        # If start and end have not crossed each other,
        # swap the numbers on start and end
        if (start < end):
            array[start], array[end] = array[end], array[start]

    # Swap pivot element with element on end pointer.
    # This puts pivot on its correct sorted place.
    array[end], array[pivot_index] = array[pivot_index], array[end]

    # Returning end pointer to divide the array into 2
    return end


# The main function that implements QuickSort
def quick_sort(start, end, array):
    if (start < end):
        # p is partitioning index, array[p]
        # is at right place
        p = partition(start, end, array)

        # Sort elements before partition
        # and after partition
        quick_sort(start, p - 1, array)
        quick_sort(p + 1, end, array)


# Driver code
array = [10, 7, 8, 9, 1, 5]
quick_sort(0, len(array) - 1, array)

print(f'Sorted array: {array}')
'''