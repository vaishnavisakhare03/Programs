# a) Write
# a
# Python
# program
# to
# store
# roll
# numbers
# of
# student in array
# who
# attended
# Training
# program in random
# order.Write
# function
# for searching whether particular
# Students attended training programs or not, using Linear search.
#
# Answer:


def Lsearch():
    flag = 0
    key = int(input("Enter Roll Number of student to search : "))
    for i in range(n):
        if (key == arr[i]):
            flag = 1
            break
    if (flag == 1):
        print("Roll Number is Present")
    else:
        print("Roll Number is Absent")


n = int(input("Enter number of students who attended the program : "))
arr = []
print("Enter Roll No. : ")

for i in range(n):
    roll = int(input("Roll No. = "))
    arr.append(roll)

print("Roll Numbers are : ")
for i in range(n):
    print(arr[i])

Lsearch()
