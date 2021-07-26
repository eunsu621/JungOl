```
633
아래와 같이 나라 이름을 출력하고 숫자를 입력받아 해당하는 나라의 수도를 출력하는 작업을 반복하다가 해당하는 번호 이외의 숫자가 입력되면 "none"라고 출력한 후 종료하는 프로그램을 작성하시오.
* 각 나라의 수도 : 
대한민국 = 서울(Seoul)
미국 = 워싱턴(Washington)
일본 = 동경(Tokyo)
중국 = 북경(Beijing)
* 입출력시 모양은 "입·출력예"와 같이 하시오.​
```
while True:
    print("1. Korea")
    print("2. USA")
    print("3. Japan")
    print("4. China")
    
    num = int(input("number? "))
    print()
    
    if num == 1:
        print("Seoul")
    elif num == 2:
        print("Washington")
    elif num == 3:
        print("Tokyo")
    elif num == 4:
        print("Beijing")
    else :
        print("none")
        break
    print()



```
125
정수를 입력받아 1부터 입력받은 정수까지를 차례대로 출력하는 프로그램을 작성하시오.
```
num = int(input())

for i in range(1, num + 1):
   print(i, end=' ')



```
126
0 이상의 정수들이 공백으로 구분되어 반복적으로 주어진다.
0이 입력되면 반복문을 멈추고 그 전까지 입력받은 수들에 대하여
홀수의 개수와 짝수의 개수를 출력하는 프로그램을 작성하시오.
```
num = list(map(int, input().split()))

odd = 0
even = 0

for i in num:
    
    if i == 0:
        break
    elif i % 2 == 0:
        even = even + 1
    else:
         odd = odd + 1

print("odd :", odd)
print("even :", even)


```
127
0 부터 100 까지의 정수를 계속 입력받다가 범위를 벗어나는 수가 입력되면 그 이전까지 입력된 자료의 합계와 평균을 출력하는 프로그램을 작성하시오.
(평균은 반올림하여 소수 첫째자리까지 출력한다.)
```
num = list(map(int, input().split()))

sum = 0

for i in num:
    
    if i > 100 or i < 0:
        break
    else:
        sum = sum + i
    
avg = sum / (len(num) - 1)

print("sum :", sum)
print("avg :", round(avg, 1))


