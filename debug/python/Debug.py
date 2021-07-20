# 526 2개의 실수(double)를 입력 받아서 두 수의 곱을 정수로 변환한 결과값과 두 수를 각각 정수로 변환하여 곱을 구한 결과값을 출력하는 프로그램을 작성하고 프로그램 내용에 관한 설명을 주석으로 표시하시오.
num1, num2 = map(float, input().split())
# 두 수의 곱을 정수로 변환
mul1 = int(num1 * num2)
# 따로따로 변환해서 곱함
mul2 = int(num1) * int(num2)
print(mul1, mul2)


#527 2개의 정수를 입력 받아서 첫 번째 수를 두 번째 수로 나눈 몫을 출력하고, 
첫 번째 수를 실수로 변환하여 두 번째 수로 나눈 값을 구한 후 반올림하여 소수 둘째 자리까지 출력하는 프로그램을 작성하고, 
프로그램 내용에 관한 설명을 주석으로 표시하시오.
num1, num2 = map(int, input().split())
# 몫 구하기
result1 = num1 // num2
# 실수로 변환 후 나누기
result2 = float(num1) / num2
print(result1, format(result2, ".2f"))


#116 정수로 된 3과목의 점수를 입력받아 평균을 구한 후 반올림하여 소수 첫째자리까지 출력하는 프로그램을 작성하시오.
sub1, sub2, sub3 = map(int, input().split())
avg = (sub1 + sub2 + sub3) / 3
print(format(avg, ".1f"))


#117 실수로 된 3과목의 점수를 입력받아 총점은 정수부분의 합계를 출력하고 평균은 실수의 평균을 구한 뒤 정수부분만 출력하는 프로그램을 작성하시오.
import math
sub1, sub2, sub3 = map(float, input().split())
sum = math.floor(sub1) + math.floor(sub2) + math.floor(sub3)
avg = math.floor((sub1 + sub2 + sub3) / 3)
print("sum", sum)
print("avg", avg)


#118
a = 5 
a += 10 
a = a - 1
print (15) 
