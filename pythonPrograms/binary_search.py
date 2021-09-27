# b) Write
# a
# Python
# program
# to
# store
# roll
# numbers
# of
# student
# arrays
# who
# attended
# a
# training
# program in sorted
# order.Write
# a
# function
# for searching whether a particular student attended a training program or not, using Binary search.
#
# Answer:


def Bsearch():
    key = int(input("Enter Roll Number of student to search : "))
    L = 0
    H = n - 1
    while L <= H:
        M = int((L + H) / 2)
        if arr[M] == key:
            print("Roll Number Is Present")
            break
        elif arr[M] > key:
            L = M + 1
        else:
            H = M - 1
    if L > H:
        print("Roll Number Is Absent")


n = int(input("Enter number of students who attended the program : "))
arr = []
print("Enter Roll No. : ")

for i in range(n):
    roll = int(input("Roll No. = "))
    arr.append(roll)

print("Roll Numbers are : ")
for i in range(n):
    print(arr[i])

Bsearch()
