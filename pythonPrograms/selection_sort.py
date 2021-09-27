def Ssort():
    for i in range(0, n - 1):
        for j in range(i + 1, n):
            if arr[i] > arr[j]:
                temp = arr[i]
                arr[i] = arr[j]
                arr[j] = temp

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
Ssort()