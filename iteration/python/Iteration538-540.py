# 538 한 개의 정수를 입력받아 양수(positive integer)인지 음수(negative number)인지 출력하는 작업을 반복하다가 0이 입력되면 종료하는 프로그램을 작성하시오.
# * 입출력예의 진한글씨는 출력값입니다.​
while True:
    x = int(input("number? "))
    
    if x > 0:
        print("positive integer")
    elif x < 0:
        print("negative number")
    else:
        break


# 539 정수를 계속 입력받다가 100 이상의 수가 입력이 되면 마지막 입력된 수를 포함하여 합계와 평균을 출력하는 프로그램을 작성하시오.
# (평균은 반올림하여 소수 첫째자리까지 출력한다.)
sum = 0;

numList = list(map(int, input().split()))

for num in numList:
    sum += num
    if (num >= 100) : break

print(sum)
print(round(sum / len(numList), 1))


# 540 정수를 입력받아서 3의 배수가 아닌 경우에는 아무 작업도 하지 않고 
# 3의 배수인 경우에는 3으로 나눈몫을 출력하는 작업을 반복하다가
# -1이 입력되면 종료하는 프로그램을 작성하시오.
# * 입출력예의 진한 글씨는 실행값이다.
while True:
    x = int(input())
    
    if x % 3 == 0:
        print(int(x / 3))
    elif x == -1: break;
