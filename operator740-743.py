# 740 세 개의 정수를 질문하는 문장 없이 입력 받아서 합계와 평균을 출력하는 프로그램을 작성하시오. (단, 평균은 소수 이하를 버리고 정수부분만 출력한다.)
import math

x = int(input())
y = int(input())
z = int(input())
sum = x + y + z
print('sum :', sum)
print('avg :', math.floor(sum /3))

# 741 한 개의 정수를 입력 받아서 출력한 후, 2만큼 증가시킨 후에 출력하는 프로그램을 작성하시오.
x = int(input())
print(x)
print(x + 2)

# 742 정수 2개를 질문하는 문장 없이 입력받아서 첫 번째 수에는 100을 증가시켜 저장하고, 두 번째 수는 10으로 나눈 나머지를 저장한 후, 두 수를 차례로 출력하는 프로그램을 작성하시오.
x = int(input())
y = int(input())
reX = x + 100
reY = y % 10
print(reX, reY)

# 743 두 개의 정수를 입력받아 두 번째 수를 1 감소시킨 후, 두 수의 곱을 새로운 변수에 저장하고, 첫 번째 수를 1 증가시킨 후 각각의 값을 출력하는 프로그램을 작성하시오.
x = int(input())
y = int(input())
reX = x + 1
reY = y - 1
mul = x * reY
print(reX, reY, mul)
