def Qsort(array, low, high):
<<<<<<< HEAD
    if low < high:
=======
    if(low < high):
>>>>>>> ea5064f63cb19cff86a71bedce9ff98c5e7435a3
        p = partition(array, low, high)
        Qsort(array, p + 1, high)
        Qsort(array, low, p - 1)


def partition(array, low, high):
    key = array[low]
    k = low
    j = high
    while k <= j:
        while k <= high and array[k] <= key:
            k += 1
        while j >= low and array[j] > key:
            j -= 1
        if k < j:
            temp = array[k]
            array[k] = array[j]
            array[j] = temp
    key = array[low]
    array[low] = array[j]
    array[j] = key
    return j


n = input("Enter number of students : ")
n = int(n)
arr = []
print("Enter Percentage")
for i in range(0, n):
    roll = float(input("Percentage = "))
    arr.append(roll)
print("Given array is :")
for i in range(0, n):
    print(arr[i])

Qsort(arr, 0, n - 1)

print("After sorting :")
for i in range(0, n):
    print(arr[i])

for i in range(0, 5):
    for j in range(0, 5):
<<<<<<< HEAD
        if arr[j] < arr[j + 1]:
            temp = arr[j]
            arr[j] = arr[j + 1]
            arr[j + 1] = temp

print("Top five percentages are")
for i in range(0, 5):
    print(arr[i])
=======
        if(arr[j]<arr[j+1]):
            temp = arr[j]
            arr[j] = arr[j+1]
            arr[j+1] = temp
            
print("Top five percentages are")
for i in range(0, 5):            
    print(arr[i])
   
    
>>>>>>> ea5064f63cb19cff86a71bedce9ff98c5e7435a3
