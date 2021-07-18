# 749 국어, 영어, 수학, 컴퓨터 과목의 점수를 입력받아서 총점과 평균을 구하는 프로그램을 작성하시오. (단, 평균의 소수점 이하는 버림한다.)
kor = int(input())
math = int(input())
eng = int(input())
com = int(input())

sum = kor + math + eng + com
avg = int(sum / 4)

print('sum', sum)
print('avg', avg)

# 750 두 정수를 입력받아서 나눈 몫과 나머지를 다음과 같은 형식으로 출력하는 프로그램을 작성하시오.
x = int(input())
y = int(input())
print('{0} / {1} = {2} ... {3}'.format(x, y, int(x / y), x % y))       

# 751  직사각형의 가로와 세로의 길이를 입력받은 후 가로의 길이는 5 증가시키고, 세로의 길이는 2배하여 저장한 후 가로의 길이, 세로의 길이, 넓이를 차례로 출력하는 프로그램을 작성하시오.
width = int(input())
length = int(input())
width += 5
length *= 2
print('width =', width)
print('length =', length)
print('area =', width * length)

# 752 두 수를 입력받아 첫 번째 수를 1 증가시킨 후 두 수를 출력하고, 다음에는 두 번째 수를 1 감소시킨 후 다시 두 수를 출력하는 프로그램을 작성하시오.
x = int(input())
y = int(input())
x += 1
print(x, y)
y -= 1
print(x, y)
