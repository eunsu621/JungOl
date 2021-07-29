```
541
문자를 입력받아서 입력받은 문자를 20번 반복하여 출력하는 프로그램을 작성하시오.
```
char = input()
print(char * 20)


```
542
10부터 20까지의 숫자를 차례대로 출력하는 프로그램을 작성하시오.for문을 사용하세요.
```
for i in range(10, 21):
    print(i)


```
543
하나의 정수를 입력받아 1부터 입력받은 정수까지의 짝수를 차례대로 출력하는 프로그램을 작성하시오.
입력되는 정수는 50이하이다.
```
num = int(input())

for i in range(num + 1):
    
    if i > 1 and i % 2 == 0:
        print(i)


```
544
100 이하의 정수를 입력받아서 입력받은 정수부터 100까지의 합을 출력하는 프로그램을 작성하시오.
```
num = int(input())
sum = 0

for i in range(num, 101):
    sum = sum + i

print(sum)
