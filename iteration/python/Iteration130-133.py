```
130
10 이하의 자연수 n을 입력받아 "JUNGOL​"을 n번 출력하는 프로그램을 작성하시오.
```
n = int(input())
print("JUNGOL\n" * n)



```
131
100 이하의 두 개의 정수를 입력받아 작은 수부터 큰 수까지 차례대로 출력하는 프로그램을 작성하시오.
```
n1, n2 = map(int, input().split())

if n1 > n2:
    max = n1
    min = n2
else:
    max = n2
    min = n1
    
for i in range(min, max+1):
    print(i, end=" ")


    
```
132
정수를 입력받아서 1부터 입력받은 정수까지의 5의 배수의 합을 구하여 출력하는 프로그램을 작성하시오.
```
n = int(input())
sum = 0

for i in range(1, n+1):
    
    if (i % 5 == 0):
        sum += i

print(sum)
