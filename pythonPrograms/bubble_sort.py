def Bsort():
    for i in range(n):
        for j in range(n - 1):
            if (arr[j + 1] < arr[j]):
                temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp

    print("Sorted array is :")
    for i in range(0, n):
        print(arr[i])


n = int(input("Enter number of students :"))
arr = []
print("Enter Percentage")
for i in range(0, n):
    roll = float(input("Percentage = "))
    arr.append(roll)
print("Given array is :")
for i in range(0, n):
    print(arr[i])
Bsort()