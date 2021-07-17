# 744 두 개의 정수를 입력받아서 두 정수의 값이 같으면 True, 아니면 False를 출력하고 두 번째 줄에는 같지 않으면 True, 아니면 False를 출력하는 프로그램을 작성하시오.
x = int(input())
y = int(input())
print(True) if x == y else print(False)
print(True) if x != y else print(False)

# 745 두 개의 정수를 입력받아서 다음과 같이 4가지 관계연산자의 결과를 출력하시오.
x = int(input())
y = int(input())
print(x,'>', y, '---', x > y)
print(x,'<', y, '---', x < y)
print(x,'>=', y, '---', x >= y)
print(x,'<=', y, '---', x <= y)

# 747 3개의 정수를 입력 받아 첫 번째 수가 가장 크면 True, 아니면 False을 출력하고 세 개의 수가 모두 같으면 True, 아니면 False를 출력하는 프로그램을 작성하시오.
# 746번이 없었음
x = int(input())
y = int(input())
z = int(input())
if (x > y) and (x > z):
    print(True, end=' ')
else:
    print(False, end=' ')
    
if (x == y) and (y == z):
    print(True)
else:
    print(False)

# 748 2개의 문자열을 입력받아서 첫 번째 문자열 2번, 두 번째 문자열 3번을 연결해서 출력하는 프로그램을 작성하시오.
x = input()
y = input()
for i in range(2):
    print(x, end='')
for i in range(3):
    print(y, end='')
