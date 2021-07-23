# 632 3개의 정수를 입력받아 조건연산자를 이용하여 입력받은 수들 중 최소값을 출력하는 프로그램을 작성하시오.
x, y, z = map(int, input().split())
min = x if x < y else y
min = z if z < min else min
print(min)


# 120 두 개의 정수를 입력받아 큰 수에서 작은 수를 뺀 차를 출력하는 프로그램을 작성하시오.
x, y = map(int, input().split())
if x > y:
    print(x - y)
else :
    print(y - x)


# 121 정수를 입력받아 0 이면 "zero" 양수이면 "plus" 음수이면 "minus" 라고 출력하는 프로그램을 작성하시오.
x = int(input())
if x == 0:
    print("zero")
elif x > 0:
    print("plus")
else:
    print("minus") 


# 122 년도를 입력받아 윤년(leap year)인지 평년(common year)인지 판단하는 프로그램을 작성하시오.
year = int(input())
if (year % 400 == 0) or (year % 4 ==0) and (year % 100 != 0):
    print("leap year")
else:
    print("common year")    

