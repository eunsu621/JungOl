#724 학교의 이름을 입력받아 출력하는 프로그램을 작성하라.
school = input("School? ")
print("Your school is",school)

#725 두 개의 정수를 입력 받아 곱과 나눈 값을 출력하시오.
num1 = int(input("Number 1? "))
num2 = int(input("Number 2? "))
result1 = '{0} * {1} = {2}'.format(num1, num2, num1 * num2)
result2 = '{0} / {1} = {2}'.format(num1, num2, num1 / num2)
print(result1)
print(result2)

#726 직사각형의 가로와 세로의 길이를 입력받아서, 그 넓이를 실수형 변수에 저장하여 출력하는 프로그램을 작성하시오.
Garo = float(input("Garo? "))
Sero = float(input("Sero? "))
result = Garo * Sero
print(result)

# 727 빈 화면에 세 문장을 입력 받아 그대로 출력하는 프로그램을 작성하시오.
str1 = input()
str2 = input()
str3 = input()
print(str1)
print(str2)
print(str3)
