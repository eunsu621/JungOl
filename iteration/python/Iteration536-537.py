# 536 1부터 15까지 차례로 출력하는 프로그램을 작성하시오. while문을 이용하세요.
i = 1
while(i < 16):
    print(i)   
    i += 1


# 537 100 이하의 양의 정수만 입력된다.
# while 문을 이용하여 1부터 입력받은 정수까지의 합을 구하여 출력하는 프로그램을 작성하시오.
num = int(input())
i = 1
sum = 0
while (i <= num):
  sum += i
  i = i + 1
print(sum)
